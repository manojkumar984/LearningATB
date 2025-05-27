package ex_10_For_Loop;

public class Lab04_For_Loop_continue_even_numbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i%2==0){
                System.out.println(i);
                continue;
            }

        }
    }
}
