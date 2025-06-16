package ex_22_Enum;

public class Lab02_Enum_part2 {
    public static void main(String[] args) {
        System.out.println(URLS.google);
        if (URLS.google.equals("google")){
            System.out.println("I want to do something");
        }
    }
}


enum URLS {
    google, restassured, selinum, java
}