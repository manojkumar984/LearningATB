package ex_15_string_buffer;

public class Lab02_string_builder_vs_buffer {
    public static void main(String[] args) {

        // 90% we will use normal string in automation
        String s0 = "manoj";
        String s1 = new String("manoj");

        // less than 10% used
        StringBuffer stringBuffer = new StringBuffer("manoj");
        StringBuilder stringBuilder = new StringBuilder("manoj");
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
