package order;

public class TransportStatus extends Status {

    @Override
    public String getFeedback() {
        return "The order is being transported.";
    }

    @Override
    protected boolean isChangeValid(Status changeStatus) {
        return changeStatus instanceof ReceivedStatus;
    }
}
