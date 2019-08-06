package by.epam.pretraining.task4.simplest_classes_and_objects.exercise8;

class ClientBase {
    private Customer[] customers;

    public ClientBase(Customer[] customers) {
        this.customers = customers;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    void printFullList() {
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i].toString());
        }
    }

    Customer[] sortBySurname() {
        for (int i = 0; i < customers.length - 1; i++) {
            int currentSurmame = i;
            for (int j = i + 1; j < customers.length; j++) {
                if (customers[j].getSurname().compareToIgnoreCase(customers[currentSurmame].getSurname()) < 0) {
                    currentSurmame = j;
                }
            }
            Customer temp = customers[currentSurmame];
            customers[currentSurmame] = customers[i];
            customers[i] = temp;
        }
        return customers;
    }

    void getCustomerByAccountRange(long min, long max) {
        for (Customer customer : customers) {
            if (customer.getAccountNumber() >= min &&
                    customer.getAccountNumber() <= max) {
                System.out.println(customer);
            }
        }
    }
}
