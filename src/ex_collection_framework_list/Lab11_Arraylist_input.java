package ex_collection_framework_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab11_Arraylist_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List list = new ArrayList<>();

        List<String> names = new ArrayList<>();

        String continueInput = "y";
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name");
            String name = scanner.next();
            names.add(name);
            scanner.nextLine();

            System.out.println("do you want to enter another name Y/N ");
            continueInput = scanner.next();
        }

        for (String name:names){
            System.out.println(name);
        }

        scanner.close();
    }
}
