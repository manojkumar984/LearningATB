package Real_example_single_inheritance;

public class Testcase2  extends commonToAllTest{
    void runningTC2(){
        startbrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running TC2");
        closebrowser();
    }
}
