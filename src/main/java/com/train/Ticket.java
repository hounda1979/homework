package com.train;


import java.util.Scanner;

public class Ticket {


    private int ticketNum;
    private  int roundTrip;
    private static final double discount = 0.9;
    private static final int ticketPrice = 1000;
    private  boolean b = true;
    int[] array={0,0};

    public Ticket() {

    }

    public Ticket(int ticketNum, int roundTrip) {
        this.ticketNum = ticketNum;
        this.roundTrip = roundTrip;

    }
    public void buyTicket(){


        do {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of tickets or enter -1 to end :");
            ticketNum = scanner.nextInt();

             if(ticketNum == -1){
                 b = false;
                 break;
            }else{
                 array[0] += ticketNum;
             }
            System.out.println("How many round-trip tickets:");
            roundTrip = scanner.nextInt();

            if(roundTrip == -1 ){
                b = false;
                break;
            }else{
                array[1] += roundTrip;
            }
            if(roundTrip > ticketNum){
                System.out.println("來回票大於票數");
                break;
            }
        }while (b);
        calculation();


    }
    /* 計算票券相關*/
    public void calculation(){
        int tickeCount = (array[0] - array[1])*ticketPrice;

        double roundTripPrice = (array[1] * discount)*ticketPrice*2;


        System.out.println("Total tickets: "+ array[0]);
        System.out.println("Round-trip: "+ array[1]);
        System.out.println("Total:" + (tickeCount + (int)roundTripPrice) );
    }

}
