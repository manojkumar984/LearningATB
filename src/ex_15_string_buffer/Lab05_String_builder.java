package ex_15_string_buffer;

public class Lab05_String_builder {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("manoj");
        stringBuilder.append("kumar");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
