package order;

public class FinishedStatus extends Status {

    @Override
    public String getFeedback() {
        return "The order has been finished.";
    }

    @Override
    void changeStatus(Status newStatus) {
        System.out.println("The status cannot be modified after finished.");
    }

    @Override
    protected boolean isChangeValid(Status changeStatus) {
        return false;
    }
}
