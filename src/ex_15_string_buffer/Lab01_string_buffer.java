package ex_15_string_buffer;

public class Lab01_string_buffer {
    public static void main(String[] args) {
        String name = "manoj";
        System.out.println(name.length());
        System.out.println(name.charAt(4));

        // concat
        System.out.println(name.concat("kumar"));

        // contains
        System.out.println(name.contains("om"));

        // equals
        System.out.println(name.equals("manoj"));

        // equalsignorecase
        System.out.println(name.equalsIgnoreCase("manoj"));

        // indexof
        System.out.println(name.indexOf('o'));

        String s1 = "madam";
        // return the index within this  string of the
        // first occurence  of the specified  substring.
        System.out.println(s1.indexOf("m"));

        // length
        System.out.println(name.length());

        // replace
        System.out.println(name.replace('n','N'));
    }
}
