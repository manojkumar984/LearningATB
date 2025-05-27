package ex_10_For_Loop;

public class Lab03_odd_even_from_top50 {
    public static void main(String[] args) {
        // to find the even numbers from 1 to 50
        // even logic is --> i%2 ==0\
        // odd logic is -->  i%2! = 0

        for (int i = 1; i <= 50 ; i++) {
            if (i%2 ==0){
                System.out.println("Even -> " +i);
            }
            
        }
    }
}
