package com.bridgelabz.oops;

import java.util.Scanner;

public class StockAccountManagement {
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    public StockAccountManagement(String stockName, int numberOfShares, double sharePrice) {
        this.stockName = stockName;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getTotalValue() {
        return numberOfShares * sharePrice;
    }

    public String toString() {
        return "Stock Name: " + stockName + "\nNumber of Shares: " + numberOfShares + "\nShare Price: $" + sharePrice + "\nTotal Value: $" + getTotalValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numberOfStocks = scanner.nextInt();

        StockAccountManagement[] stocks = new StockAccountManagement[numberOfStocks];

        for (int i = 0; i < numberOfStocks; i++) {
            scanner.nextLine();
            System.out.print("\nEnter Stock Name: ");
            String stockName = scanner.nextLine();
            System.out.print("Enter Number of Shares: ");
            int numberOfShares = scanner.nextInt();
            System.out.print("Enter Share Price: $");
            double sharePrice = scanner.nextDouble();

            stocks[i] = new StockAccountManagement(stockName, numberOfShares, sharePrice);
        }

        double totalValueOfAllStocks = 0;

        for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("\nStock #" + (i+1));
            System.out.println(stocks[i].toString());
            totalValueOfAllStocks += stocks[i].getTotalValue();
        }

        System.out.println("\nTotal Value of All Stocks: $" + totalValueOfAllStocks);
    }
}