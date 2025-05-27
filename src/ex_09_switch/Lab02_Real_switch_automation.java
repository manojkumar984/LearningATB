package ex_09_switch;

import java.util.Scanner;

public class Lab02_Real_switch_automation {
    public static void main(String[] args) {

        // web automation
        // i will ask user to give me the input from the browser which he wants
        // string browser = args[0];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome", "opera":
                System.out.println("Starting the chrome");
                System.out.println("................");
                System.out.println("Test Case 1");
                System.out.println("Test case 2");
                break;
            case "firefox":
                System.out.println("starting the firefox browser");
                // further code to start the firefox
                // webdriver = new firefox(); // selenium code
                break;
            case "microsoft":
                System.out.println("Excute the edge case");
                break;
            default :
                System.out.println("I have no idea which browser is this");
                break;
        }




    }
}
