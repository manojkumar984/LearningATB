package ex_22_Enum;

public class Lab04_Locators {

    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(Lab05_APIURLS.google.getUrl());
    }
}


enum Locators {
    page_button("#btn"),
    page_input("#input1");

    private String Locator;

    Locators(String locator) {
        Locator = locator;
    }

    public String getLocator() {
        return Locator;
    }

}
