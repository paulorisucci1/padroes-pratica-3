package order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {

    private Set<String> items;

    private String client;

    private Status status;

    public Order() {
        this.items = new HashSet<>();
        this.status = new PreparationStatus();
        this.status.setOrder(this);
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Status getStatus() {
        return status;
    }

    public void updateStatus(Status status) {
        this.status.changeStatus(status);
    }

    void setStatus(Status status) {
        this.status = status;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(String item) {
        if(!items.contains(item)) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "order.Order{" +
                "items=" + items +
                ", client='" + client + '\'' +
                ", status=" + status.getFeedback() +
                '}';
    }
}
