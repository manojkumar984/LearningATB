package ex_24_exceptions;

public class Lab10_ThrowExample {
    public static void main(String[] args) {

        //validate_age_for_pub(24);
        validate_age_for_pub(17);


    }

    static void validate_age_for_pub (int age){
        if (age < 18){
            try {
                throw new Exception("Age cant be 18");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Enjoy clubing");
        }
    }
}
