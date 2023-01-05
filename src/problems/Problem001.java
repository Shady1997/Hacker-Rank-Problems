package problems;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Problem001 {

    public static void main(String[] args) {

        // get currency from user
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // check payment constraint firstly
        if (payment >= 0 && payment <= Math.pow(10, 9)) {
            // Create a new Locale
            Locale usac = new Locale("en", "US");
            Locale indiac = new Locale("hi", "IN");
            Locale chinac = new Locale("zh", "CN");
            Locale francec = new Locale("fr", "FR");

            // Create a formatter given the Locale
            NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(usac);
            NumberFormat rupeeFormat = NumberFormat.getCurrencyInstance(indiac);
            NumberFormat yuanFormat = NumberFormat.getCurrencyInstance(chinac);
            NumberFormat euroFormat = NumberFormat.getCurrencyInstance(francec);

            // string values
            String us = dollarFormat.format(payment);
            String india = rupeeFormat.format(payment);
            String china = yuanFormat.format(payment);
            String france = euroFormat.format(payment);

            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        } else System.out.println("invalid payment value");
    }
}
//        double currencyAmount = 1500.00;
//// Create a new Locale
//        Locale usa = new Locale("en", "US");
//        Locale india = new Locale("hi", "IN");
//        Locale china = new Locale("zh", "CH");
//        Locale france = new Locale("fr", "FR");
//// Create a Currency instance for the Locale
//        Currency dollars = Currency.getInstance(france);
//// Create a formatter given the Locale
//        NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(france);
//
//// Format the Number into a Currency String
//        System.out.println(dollars.getDisplayName() + ": " + dollarFormat.format(currencyAmount));

