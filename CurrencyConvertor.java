package currency;

import java.util.Scanner;

public class CurrencyConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertInrToEuro() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Euro = " + (inr / 90));
    }

    public void convertEuroToInr() {
        System.out.print("Enter Euro: ");
        double euro = sc.nextDouble();
        System.out.println("INR = " + (euro * 90));
    }

    public void convertInrToDollar() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Dollar = " + (inr / 83));
    }

    public void convertDollarToInr() {
        System.out.print("Enter Dollar: ");
        double dollar = sc.nextDouble();
        System.out.println("INR = " + (dollar * 83));
    }

    public void convertInrToYen() {
        System.out.print("Enter INR: ");
        double inr = sc.nextDouble();
        System.out.println("Yen = " + (inr * 1.75));
    }

    public void convertYenToInr() {
        System.out.print("Enter Yen: ");
        double yen = sc.nextDouble();
        System.out.println("INR = " + (yen / 1.75));
    }
}
package distance;

import java.util.Scanner;

public class DistanceConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertMeterToKm() {
        System.out.print("Enter Meter: ");
        double meter = sc.nextDouble();
        System.out.println("Kilometer = " + (meter / 1000));
    }

    public void convertKmToMeter() {
        System.out.print("Enter Kilometer: ");
        double km = sc.nextDouble();
        System.out.println("Meter = " + (km * 1000));
    }

    public void convertMilesToKm() {
        System.out.print("Enter Miles: ");
        double miles = sc.nextDouble();
        System.out.println("Kilometer = " + (miles * 1.60934));
    }

    public void convertKmToMiles() {
        System.out.print("Enter Kilometer: ");
        double km = sc.nextDouble();
        System.out.println("Miles = " + (km / 1.60934));
    }
}
package time;

import java.util.Scanner;

public class TimeConvertor {
    Scanner sc = new Scanner(System.in);

    public void convertHourToMinute() {
        System.out.print("Enter Hour: ");
        double hour = sc.nextDouble();
        System.out.println("Minutes = " + (hour * 60));
    }

    public void convertMinuteToHour() {
        System.out.print("Enter Minutes: ");
        double minute = sc.nextDouble();
        System.out.println("Hours = " + (minute / 60));
    }

    public void convertHourToSeconds() {
        System.out.print("Enter Hour: ");
        double hour = sc.nextDouble();
        System.out.println("Seconds = " + (hour * 3600));
    }

    public void convertSecondsToHour() {
        System.out.print("Enter Seconds: ");
        double seconds = sc.nextDouble();
        System.out.println("Hours = " + (seconds / 3600));
    }
}
import currency.CurrencyConvertor;
import distance.DistanceConvertor;
import time.TimeConvertor;
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor cc = new CurrencyConvertor();
        DistanceConvertor dc = new DistanceConvertor();
        TimeConvertor tc = new TimeConvertor();

        int code, currency_code, distance_code, time_code;

        System.out.println("1. Currency");
        System.out.println("2. Distance");
        System.out.println("3. Time");
        System.out.print("Enter the code: ");
        code = sc.nextInt();

        if (code == 1) {

            System.out.println("\n1. Euro");
            System.out.println("2. Dollar");
            System.out.println("3. Yen");
            System.out.print("Enter Currency code: ");
            currency_code = sc.nextInt();

            if (currency_code == 1) {
                cc.convertInrToEuro();
                cc.convertEuroToInr();
            }
            else if (currency_code == 2) {
                cc.convertInrToDollar();
                cc.convertDollarToInr();
            }
            else if (currency_code == 3) {
                cc.convertInrToYen();
                cc.convertYenToInr();
            }
            else {
                System.out.println("Invalid Currency Code");
            }
        }

        else if (code == 2) {

            System.out.println("\n1. Meter");
            System.out.println("2. Miles");
            System.out.print("Enter Distance code: ");
            distance_code = sc.nextInt();

            if (distance_code == 1) {
                dc.convertMeterToKm();
                dc.convertKmToMeter();
            }
            else if (distance_code == 2) {
                dc.convertMilesToKm();
                dc.convertKmToMiles();
            }
            else {
                System.out.println("Invalid Distance Code");
            }
        }

        else if (code == 3) {

            System.out.println("\n1. Minutes");
            System.out.println("2. Seconds");
            System.out.print("Enter Time code: ");
            time_code = sc.nextInt();

            if (time_code == 1) {
                tc.convertHourToMinute();
                tc.convertMinuteToHour();
            }
            else if (time_code == 2) {
                tc.convertHourToSeconds();
                tc.convertSecondsToHour();
            }
            else {
                System.out.println("Invalid Time Code");
            }
        }

        else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
