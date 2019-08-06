package by.epam.pretraining.task4.simplest_classes_and_objects.exercise6;

/**
 * Составьте описание класса для представления времени.
 * Предусмотрте возможности установки времени и изменения
 * его отдельных полей (час, минута, секунда)
 * с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

public class Time {

    private int hour;
    private int minute;
    private int second;

    Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    Time(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("Incorrect value hour " + hour + " set default 00");
        }

        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("Incorrect value minutes " + minute + " set default 00");
        }

        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("Incorrect value seconds " + second + " set default 00");
        }
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
            System.out.println("Set incorrect value hour " + hour + " set default 00");

        }
    }


    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
            System.out.println("Set incorrect value minutes " + minute + " set default 00");
        }
    }


    public void setSecond(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        } else {
            this.second = 0;
            System.out.println("Set incorrect value seconds " + second + " set default 00");
        }
    }

    public void correctForHours(int hour) {
        if (this.hour + hour < 24 && this.hour + hour >= 0) {
            this.hour += hour;
        } else {
            System.out.println("Incorrect value (out of day) with changing hours for" + hour + ", hours not changed");
        }

    }

    public void correctForMinutes(int minute) {
        if (this.minute + minute >= 0 && this.minute + minute < 60) {
            this.minute += minute;
        } else {
            if (this.hour + minute / 60 >= 0 && this.hour + minute / 60 < 24) {
                this.hour += (int) minute / 60;
                this.minute += minute % 60;
            } else {
                System.out.println("Incorrect value (out of day) with changing minutes for" + minute + ", time not changed");
            }
        }
    }

    public void correctForSeconds(int second) {

        if (second >= 0) {
            if (this.second + second >= 0 && this.second + second < 60) {
                this.second += second;
            } else {
                if ((this.minute + (second / 60)) >= 0 && (this.minute + (second / 60)) < 60) {
                    this.minute += (int) second / 60;
                    this.second += second % 60;

                } else {
                    if (this.hour + (second / 60) / 60 >= 0 && this.hour + (second / 60) / 60 < 24) {


                        this.second += second % 60;
                        this.minute += second / 60;

                        this.hour += (int) this.minute / 60;


                        this.minute %= 60;

                    } else {
                        System.out.println("Incorrect value (out of day) with changing seconds for" + second + ", time not changed");
                    }
                }
            }
        } else {
            System.out.println("Incorrect value, it can not be negative. Time didn't change.");
        }
    }

    public void getTime() {
        System.out.format("%02d:%02d:%02d%n", hour, minute, second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Time time = new Time();

        time.getTime();
        time.setHour(5);
        time.getTime();


        time = new Time(5, 10, 62);

        time.getTime();
        time.correctForMinutes(1000);
        time.getTime();
        time.correctForSeconds(-5);
        time.getTime();
    }
}
