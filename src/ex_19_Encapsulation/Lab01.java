package ex_19_Encapsulation;

public class Lab01 {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);


        GoodVWOlogin vwOlogin1 = new GoodVWOlogin("admin", "pwd123");
        // System.out.println(vwOlogin1.password);
        System.out.println(vwOlogin1.getUsename());
        System.out.println(vwOlogin1.getPassword());

        vwOlogin1.setUsename("manoj");
        System.out.println(vwOlogin1.getUsename());
        vwOlogin1.setPassword("manoj@123",true);
        System.out.println(vwOlogin1.getPassword());
    }
}

    class VWOLogin{
        String username;
        String password;

        public VWOLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }



    class GoodVWOlogin {
        private String usename;
        private String password;

        public GoodVWOlogin(String usename, String password) {
            this.usename = usename;
            this.password = password;
        }


        public String getUsename() {
            return usename;
        }

        public void setUsename(String usename) {
            this.usename = usename;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password, boolean isAdmin) {
            if (isAdmin) {
                this.password = password;
            } else {
                System.out.println("Not Allowed set the password, Not a admin");
            }
        }
    }


