package by.epam.pretraining.task4.simplest_classes_and_objects.exercise3;

/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
 * студентов, имеющих оценки, равные только 9 или 10.
 */

public class Student {

    private String name;
    private int group;
    private int[] grades;


    private Student(String name, int group, int[] grades) {
        this.name = name;
        this.group = group;
        this.grades = grades;
    }

    private static void printExcellentStudent(Student[] students) {
        for (Student student : students) {
            int minGrade = 10;
            for (int grade : student.grades) {
                if (grade < minGrade) {
                    minGrade = grade;
                }
            }
            if (minGrade >= 9) {
                System.out.printf("Excellent student: %s, from group %d. %n", student.name, student.group);
            }
        }

    }

    public static void main(String[] args) {
        Student[] students = new Student[10];

        students[0] = new Student("Petrov P.M.", 620, new int[]{4, 6, 8, 7, 6});
        students[1] = new Student("Ivanov I.N.", 610, new int[]{9, 8, 8, 10, 9});
        students[2] = new Student("Voronov V.V.", 610, new int[]{4, 5, 7, 10, 6});
        students[3] = new Student("Malchuk A.S.", 620, new int[]{10, 10, 10, 10, 10});
        students[4] = new Student("Kovalchuk E.A.", 610, new int[]{7, 6, 8, 7, 9});
        students[5] = new Student("Hrustch Y.A.", 610, new int[]{9, 9, 10, 10, 9});
        students[6] = new Student("Boguslavsky P.K.", 620, new int[]{9, 9, 8, 10, 9});
        students[7] = new Student("Dmitrievich M.M.", 620, new int[]{3, 6, 5, 7, 4});
        students[8] = new Student("Meleshkevich D.A.", 620, new int[]{7, 9, 8, 7, 9});
        students[9] = new Student("Chernuhin M.V.", 620, new int[]{10, 9, 9, 10, 9});

        printExcellentStudent(students);
    }

}
