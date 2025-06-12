package ex_19_superkeyword;

public class Lab01 {

}

class BaseClass{
    private String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser,boolean isAdmin) {
        if (isAdmin){
        this.browser = browser;
    }else {
            System.out.println("change browser not allowed, not a admin");
        }

}

void openBrowser() {
    System.out.println("opening Browser!");
    }

    void openBrowser(String browserName) {
        System.out.println("open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

class Testcase1 extends BaseClass{

    public void tc(){}
    public Testcase1(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("chrome");
        super.closeBrowser();

        this.tc();

    }
}


