package ex_19_part2_oops_encap;

public class Lab02 {
    public static void main(String[] args) {

        ICICIBank manoj = new ICICIBank("manoj","100");
        System.out.println(manoj.getBal());

        boolean isCashier = true;
        manoj.setBal(1000,isCashier);
        System.out.println(manoj.getBal());
        System.out.println(manoj.bank_name);
    }
}

class ICICIBank {

    private String name;
    private long bal;
    public String bank_name = "ICICI";

    public ICICIBank(String name, String bal) {
        this.name = name;
        this.bal = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the bal");
        }
    }
}