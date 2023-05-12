import order.*;
import order.FinishedStatus;
import order.PreparationStatus;
import order.ReceivedStatus;
import order.TransportStatus;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        order.setClient("Paulo");
        order.addItem("Pão");
        order.addItem("Alface");
        order.addItem("Frango");

        Map<Integer, Status> statusMap = Map.of(
                1, new PreparationStatus(),
                2, new TransportStatus(),
                3, new ReceivedStatus(),
                4, new FinishedStatus()
        );

        try(Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("Which status would you like to put the order onto?");
                System.out.println("1 - Preparation\n2 - Transport\n3 - Received\n4 - Finished");

                int response = Integer.parseInt(scanner.nextLine());
                Status chosenStatus = statusMap.get(response);

                order.updateStatus(chosenStatus);
                System.out.println("Order currently: "+order);

                if(chosenStatus instanceof FinishedStatus) {
                    System.out.println("The order has been finished.");
                    break;
                }
            }
        }
    }
}
