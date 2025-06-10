package ex_18_OOPS_Constructors;

public class Lab01_oops_constructors {
    public static void main(String[] args) {
        baby b1 = new baby();
        new baby();
        new baby();
    }

}

    class baby {

        String name;

         baby() {
             System.out.println("Iam called, object is created!");


        }
    }

