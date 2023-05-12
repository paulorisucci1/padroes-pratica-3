package order;

public class PreparationStatus extends Status {

    @Override
    public String getFeedback() {
        return "The order is being prepared.";
    }

    @Override
    protected boolean isChangeValid(Status changeStatus) {
        return changeStatus instanceof TransportStatus;
    }
}
