package ex_15_string_buffer;

public class Lab06_string_buffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("java");
        stringBuffer.append("programming");
        System.out.println(stringBuffer);
       // stringBuffer.delete(5,16);
       // System.out.println(stringBuffer);
        stringBuffer.replace(0,4,"c++");
        System.out.println(stringBuffer);
    }
}
