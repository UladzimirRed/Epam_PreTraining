package by.epam.pretraining.task4.simplest_classes_and_objects.exercise9;

import java.util.Arrays;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(авторы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * а) список кинг заданного автора;
 * б) список книг, выпущенных заданным издательствомж
 * в) список кинг, выпущенных после заданного года.
 */

public class Book {
    private static int genId = 1;
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year;
    private int pageNum;
    private double price;
    private String bindingType;

    public Book(int id, String title, String[] authors, String publisher, int year, int pageNum, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageNum = pageNum;
        this.price = price;
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Title='" + title + '\'' +
                ", Authors=" + Arrays.toString(authors) +
                ", Publisher='" + publisher + '\'' +
                ", Year of publishing=" + year +
                ", Number of pages=" + pageNum +
                ", Price=" + price +
                ", Binding type='" + bindingType + '\'' +
                '}';
    }

    public static int getGenId() {
        return genId;
    }

    public static void setGenId(int genId) {
        Book.genId = genId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
}
