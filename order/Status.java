package order;

public abstract class Status {

    protected Order order;

    void setOrder(Order order) {
        this.order = order;
    }

    public abstract String getFeedback();

    void changeStatus(Status newStatus) {
        if(isChangeValid(newStatus)) {
            this.order.setStatus(newStatus);
            newStatus.setOrder(this.order);
            this.order = null;
        } else {
            System.out.println("The status change is invalid.");
        }
    }

    protected abstract boolean isChangeValid(Status changeStatus);
}
