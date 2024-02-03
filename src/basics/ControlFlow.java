package basics;

import java.sql.SQLOutput;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry;
        hungry = true;

        // boolean operators: == , > , < , <= , >=, !()

        // dead-code: it will always be false
        if(2 < 2){
            System.out.println("I'm starving...");
        } else if (4 > 3){
            System.out.println("I'm not hungry");
        } else {
            System.out.println("Test");
        }

        int month = 1;
        String monthString;
        switch (month) {
            case 1: monthString = "January";
                break;
            case 2: monthString = "February";
                break;
            case 3: monthString = "March";
                break;
            default: monthString = "Unknown";
            }
        }
    }
