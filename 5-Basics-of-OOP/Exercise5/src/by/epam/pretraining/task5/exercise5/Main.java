package by.epam.pretraining.task5.exercise5;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Designer firstPresent = new Designer(Type.CHOCOLATE);
        System.out.println(firstPresent.toString());
        Designer secondPresent = new Designer(Type.WAFFLES);
        System.out.println(secondPresent.toString());
        Designer thirdPresent = new Designer(Type.WAFFLES);

        boolean isEquals = firstPresent.equals(secondPresent);
        System.out.println(isEquals);
        isEquals = secondPresent.equals(thirdPresent);
        System.out.println(isEquals);
    }
}
