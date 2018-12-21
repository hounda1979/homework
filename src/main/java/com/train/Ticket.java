package com.train;

public class Ticket {
    private int ticketNum;
    private  int roundTrip;
    private static final double discount = 0.9;
    private static final int ticketPrice = 1000;

    public Ticket(int ticketNum, int roundTrip) {
        this.ticketNum = ticketNum;
        this.roundTrip = roundTrip;

    }

    public void Calculation(){
        int tickeCount = (ticketNum - roundTrip)*ticketPrice;
        double roundTripPrice = (roundTrip * discount)*ticketPrice*2;



        System.out.println("Total tickets: "+ ticketNum);
        System.out.println("Round-trip: "+ roundTrip);
        System.out.println("Total:" + (tickeCount + (int)roundTripPrice) );
    }

}
