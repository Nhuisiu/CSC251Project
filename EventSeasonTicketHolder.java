public class EventSeasonTicketHolder {
    //Creating variable

    String customerName;
    String ticketPlan;
    String ticketPlanType;
    double purchasedTicket;

    double reservationFee;
    double planPrice;
    double costPerLiveEvent;
    double perLiveEvent;



    //Constructor
    public EventSeasonTicketHolder() {

    }
    public EventSeasonTicketHolder(String customerName, String ticketPlanType, String ticketPlan, double purchasedTicket, double perLiveEvent) {
        this.customerName = customerName;
        this.ticketPlanType = ticketPlanType;
        this.ticketPlan = ticketPlan;
        this.purchasedTicket = purchasedTicket;
        this.perLiveEvent = perLiveEvent;
    }

    /*
    Getter and Setter
     */
    public String getCustomerName() {
        return this.customerName;
    }

    /**
     *
     * @param customerName
     * set customer name
     */

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    /**
     * set the purchase ticket amount
     * @param purchasedTicket
     */
    public void setPurchasedTicket(int purchasedTicket) {
        this.purchasedTicket = purchasedTicket;
    }

    public String getTicketPlanType() {
        return this.ticketPlanType;
    }

    /**
     * get the ticket different type
     * @param ticketPlanType
     */
    public void setTicketPlanType(String ticketPlanType) {
        this.ticketPlanType = ticketPlanType;
    }

    /**
     *
     * @return the price for live event cost
     */
    public double calculateLiveEventCost() {
        return purchasedTicket * perLiveEvent;
    }

    /**
     *
     * @return calculate the live reservation fee
     */
    public double calculateLiveEventReservationFee() {

        if (purchasedTicket > 0 && purchasedTicket <= 7 ) {
            reservationFee = 214.00;
        } else if(purchasedTicket >= 8 && purchasedTicket <= 14) {
            reservationFee = 323.59;
        } else if(purchasedTicket >= 15 && purchasedTicket <= 20) {
            reservationFee = 413.50;
        }
        planPrice = ((costPerLiveEvent * purchasedTicket) + reservationFee);
        return planPrice;
    }

    /**
     *
     * @return total price
     */
    public double ticketPlanPrice() {
        return calculateLiveEventCost() + calculateLiveEventReservationFee();
    }
}