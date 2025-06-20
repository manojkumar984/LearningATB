package ex_24_exceptions;

public class Bank {

    private String currency;
    private Integer amount;

    public Bank(String currency, String amount) {
        this.currency = currency;
        this.amount = 10;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


    public  Integer add(Bank bankName) {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new CustomException("Currency mismatch, cant proceed");
            } catch (CustomException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CustomException extends Exception{
    CustomException(String msg){
        super(msg);
    }
}
