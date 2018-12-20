package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int TicketNum = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundNum = scanner.nextInt();
        Ticket ticket = new Ticket(TicketNum,roundNum);
        ticket.Calculation();

    }
}
