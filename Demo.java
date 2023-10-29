import java.util.ArrayList;
import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {

        //Creating varibale
        String customerName = "";
        int purchasedTicket = 0;
        String loop = "Y";
        String ticketPlan = "";
        String ticketPlanType = "";
        double perLiveEvent = 0;
        double allTotalTicket = 0;
        double allTotalRev = 0;

        Scanner userInput = new Scanner(System.in);

        ArrayList<EventSeasonTicketHolder> events = new ArrayList<>();


        //Creating loop for customer name and purchase ticket
        while(loop.equalsIgnoreCase("Y")) {

            System.out.print("Enter the customer's name: ");
            customerName = userInput.nextLine();
            System.out.println("");
            while(loop.equalsIgnoreCase("Y")) {
                System.out.println("Choose from one of the following Live Event Ticket Plans: \n\tA. Standard Seating - $22.99 / per event" +
                        "\n\tB. Premium Seating - $117.99 / per event\n\tC. Luxury Seating - $235.99 / per event");
                System.out.print("Enter your choice (A, B, or C): ");
                ticketPlan = userInput.nextLine();
                if (ticketPlan.equalsIgnoreCase("A")) {
                    ticketPlanType = "Standard Seating";
                    perLiveEvent = 22.99;
                    loop = "N";
                } else if (ticketPlan.equalsIgnoreCase("B")) {
                    ticketPlanType = "Premium Seating";
                    perLiveEvent = 117.99;
                    loop = "N";
                } else if (ticketPlan.equalsIgnoreCase("C")) {
                    ticketPlanType = "Luxury Seating";
                    perLiveEvent = 235.99;
                    loop = "N";
                } else {
                    System.out.println("ERROR: INVALID CHOICE, please try again.");
                    loop = "Y";
                }
            }

            loop = "Y";
            while(loop.equalsIgnoreCase("Y")) {
                System.out.print("How many live events are being purchased? (Min: 1, Max: 20 events)");
                purchasedTicket = userInput.nextInt();
                if(purchasedTicket >= 1 && purchasedTicket <= 20) {
                    purchasedTicket = purchasedTicket;
                    loop = "N";
                }
                else {
                    System.out.println("ERROR: INVALID NUMBER OF EVENTS ENTERED, please try again.");
                }

            }
            EventSeasonTicketHolder customers = new EventSeasonTicketHolder(customerName, ticketPlanType, ticketPlan, purchasedTicket, perLiveEvent);
            events.add(customers);

            loop = "Y";
            System.out.println("Do you wish to enter information for another ticket holder (Y/N)?");
            userInput.nextLine();
            loop = userInput.nextLine();
            System.out.println("");
            System.out.println("");


        }


        //For loop for the arraylist to print out the display
        for (int i = 0; i < events.size(); i++) {
            System.out.println("Customer Name: " + events.get(i).getCustomerName());
            System.out.println("Live Event Ticket Plan: " + events.get(i).ticketPlanType);
            System.out.println("Number of Live Events: " + events.get(i).purchasedTicket);
            System.out.println("Cost Per Live Event: " + events.get(i).perLiveEvent);
            System.out.printf("Live Event Ticket Reservation Subtotal: $%,.2f", events.get(i).calculateLiveEventCost());
            System.out.printf("\nLive Event Ticket Reservation Fee: $%,.2f", events.get(i).calculateLiveEventReservationFee());
            System.out.printf("\nTicket Plan Price: $%,.2f", events.get(i).ticketPlanPrice());

            System.out.println("");
            System.out.println("");
            allTotalTicket += events.get(i).purchasedTicket;
            allTotalRev += events.get(i).ticketPlanPrice();

        }

        System.out.println("Totals:");
        System.out.println("---------------------------");
        System.out.println("Total Ticket Holders: " + events.size());
        System.out.println("Total Events Purchased:" + allTotalTicket);
        System.out.printf("Total Ticket Revenue: $%,.2f", allTotalRev);
    }
}