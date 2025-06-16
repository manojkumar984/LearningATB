package ex_22_Enum;

import ex_17_OOPS.MainLabTask;

public class Lab01_Enum {
    public static void main(String[] args) {
        System.out.println(Day.SUNDAY);
        System.out.println(Day.FRIDAY);
    }
}

// constants List
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}
