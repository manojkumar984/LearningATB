package ex_13_functions;

public class Lab03_user_defined_one {
    public static void main(String[] args) {

       int r1 =  sum_of_two_number(4,5);
        System.out.println(r1);
        int r2 =  sum_of_two_number(10,20);
        System.out.println(r2);


    }

    static int sum_of_two_number(int first, int second){
      return first+second;
    }



}
