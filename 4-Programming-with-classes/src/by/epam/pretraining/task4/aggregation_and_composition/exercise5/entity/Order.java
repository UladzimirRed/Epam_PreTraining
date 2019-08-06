package by.epam.pretraining.task4.aggregation_and_composition.exercise5.entity;

public class Order {
    private static int genId = 1;
    private int id;
    private Client client;
    private Tour tour;

    public Order(Client client, Tour tour) {
        this.id = genId++;
        this.client = client;
        this.tour = tour;
    }

    public int getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    @Override
    public String toString() {
        return "Order{" + "client=" + client + ", tour=" + tour + '}';
    }
}
