package com.train;

public class Ticket {
    private int ticketNum;
    private  int roundTrip;
    private double discount = 0.9;
    private int ticketPrice = 1000;

    public Ticket(int ticketNum, int roundTrip) {
        this.ticketNum = ticketNum;
        this.roundTrip = roundTrip;
        if(!Checking()){
            System.out.println("錯誤!! 來回票大於購買票數");
        }
    }

    public void Calculation(){
        int tickeCount = (ticketNum - roundTrip)*ticketPrice;
        double roundTripPrice = (roundTrip * discount)*ticketPrice*2;



        System.out.println("Total tickets: "+ ticketNum);
        System.out.println("Round-trip: "+ roundTrip);
        System.out.println("Total:" + (tickeCount + (int)roundTripPrice) );
    }
    private boolean Checking(){
        boolean b = true;
        if((ticketNum - roundTrip) < 0){
            b = false;
        }
        return  b;
    }
}
