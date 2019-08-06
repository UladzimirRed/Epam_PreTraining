package by.epam.pretraining.task4.simplest_classes_and_objects.exercise8;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер n  кредитной карточки находится в заданном интервале
 */

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private long cardNumber;
    private long AccountNumber;

    public Customer(int id, String surname, String name, String middleName, String address, long cardNumber, long accountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        AccountNumber = accountNumber;
    }

    Customer(String surname, String name, long accountNumber) {
        this.surname = surname;
        this.name = name;
        AccountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Surname of customer - '" + surname + '\'' +
                ", Name - '" + name + '\'' +
                ", Middle name -'" + middleName + '\'' +
                ", Residential address: '" + address + '\'' +
                ", Credit card number: " + cardNumber +
                ", Bank account number: " + AccountNumber +
                '}';
    }
}
