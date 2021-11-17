package com.ninePrac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market obj = new Market();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("System is started \n");
            String checkName = scanner.nextLine();
            int checkID = Integer.parseInt(scanner.nextLine());
            obj.checkDB(checkName,checkID);
        }
        catch(MarketException e) {
            System.out.println("Base is crashed");
            System.out.println(e);
        }

    }
}
