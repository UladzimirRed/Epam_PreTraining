package by.epam.pretraining.task1.linear;

public class Exercise5 {

    public static void run() {

        int t = 39572;

        changeDateFormat(t);
    }


    private static void changeDateFormat(int t) {

        int hours = t / 3600;
        int minutes = (t - hours * 3600) / 60;
        int seconds = t - (minutes * 60 + hours * 3600);

        System.out.println(hours + "h " + minutes + "min " + seconds + "sec");
    }
}


