package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
     Ticket ticket = new Ticket();
     ticket.buyTicket();





        }





//homework1
    private static void buyticket() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int TicketNum = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundNum = scanner.nextInt();
        Ticket ticket = new Ticket(TicketNum,roundNum);
        if((TicketNum - roundNum)<=0){
            System.out.println("來回票大於票數");
        }else {
            ticket.calculation();
        }
    }
}
