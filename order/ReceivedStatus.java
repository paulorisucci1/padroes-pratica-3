package order;

public class ReceivedStatus extends Status {

    @Override
    public String getFeedback() {
        return "The order has been received.";
    }

    @Override
    protected boolean isChangeValid(Status newStatus) {
        return newStatus instanceof PreparationStatus || newStatus instanceof FinishedStatus;
    }
}
