package poly_method_overriding;

public class Realexample {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();

    }
}

    class commomToAllTC{
        void openBrowser(){
            System.out.println(" open the browser");
        }
    }

    class TC_Chrome extends commomToAllTC{
        @Override
        void openBrowser(){
            System.out.println("starting a chrome");
            // new ChromeDriver();
        }


    }

