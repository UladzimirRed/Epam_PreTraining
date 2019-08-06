package by.epam.pretraining.task4.simplest_classes_and_objects.exercise8;

public class Main {
    public static void main(String[] args) {
        ClientBase customerService = new ClientBase(new Customer[]{
                new Customer(1, "Chernuhin", "Michail", "Vladimirovich", "Minsk",
                        4649901104102564L, 23441356123L),
                new Customer(2, "Molofey", "Dzmitry", "Aliaksandravich", "Molodechno",
                        5145258415653210L, 3213L),
                new Customer(3, "Laziuk", "Semen", "Petrovich", "Brest",
                        4805482065157043L, 18515L),
                new Customer(4, "Dmitrievich", "Vitaliy", "dmitrievich", "Voronovo",
                        5214751335786549L, 2313L),
                new Customer(5, "Syramalot", "Yuri", "Aleksandrovich", "Klychev",
                        4942426894736842L, 98L),
                new Customer(6, "Meleshkevich", "Siarhey", "Vladimirovich", "Radashkovichi",
                        4456987351268469L, 552L),
                new Customer(7, "Boguslavskij", "Pavel", "Kazimirovich", "Volozhin",
                        5587321456563334L, 7766L),
                new Customer(8, "Myshkina", "Olga", "Maksimovna", "Gancevichy",
                        4146468766993212L, 133L),
        });
        customerService.printFullList();
        System.out.println("Sort customers by surname: ");
        customerService.sortBySurname();
        customerService.printFullList();
        System.out.println("Customers who have funds in an account in a given range:");
        customerService.getCustomerByAccountRange(100, 5000);
    }
}
