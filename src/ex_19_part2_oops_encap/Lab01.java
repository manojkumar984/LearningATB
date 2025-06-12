package ex_19_part2_oops_encap;

public class Lab01 {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin","pwd123");
        // System.out.println(vwoLogin1.password);
        System.out.println(vwoLogin1.getUsername());
        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setUsername("manoj");
        System.out.println(vwoLogin1.getUsername());
        vwoLogin1.setPassword("manoj@123",true);
        System.out.println(vwoLogin1.getPassword());


    }
}



   class VWOLogin{
        public String username;
        public String password;

        public VWOLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }


class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Not Allowed to set the password, Not a Admin");
        }
    }
}

