package by.epam.pretraining.task3.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *    <note id = "1">
 *       <to>Вася</to>
 *       <from>Света</from>
 *       <heading>Напоминание</heading>
 *       <body>Позвони мне завтра!</body>
 *    </note>
 *    <note id = "2">
 *        <to>Петя</to>
 *        <from>Маша</from>
 *        <heading>Важное напоминание</heading>
 *        <body/>
 *    </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 * xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 * тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Exercise2 {

    public static void run(){
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        String xmlAnalysis = xmlAnalyzer(xml);
        System.out.println(xmlAnalysis);
    }

    private static String xmlAnalyzer(String xml){
        StringBuilder stringBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String[] lines = xml.split("\n\\s*");

        for (String line : lines){
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()){
                stringBuilder.append(mEmpty.group());
                stringBuilder.append(" - тег без тела\n");
            }else if (mOpen.find()){
                stringBuilder.append(mOpen.group());
                stringBuilder.append(" - открывающий тег\n");
            }
            if (mBody.find()){
                stringBuilder.append(mBody.group().substring(1));
                stringBuilder.append("\\b - содержимое тега\n");
            }
            if (mClose.find()){
                stringBuilder.append(mClose.group());
                stringBuilder.append(" - закрывающий тег\n");
            }
        }
        return stringBuilder.toString();
    }

}
