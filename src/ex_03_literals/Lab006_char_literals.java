package ex_03_literals;

public class Lab006_char_literals {
    public static void main(String[] args) {
        char c1 = 'A'; // A-Z, a-z, !@#$%^&*() also
        // char c2 = "A" "" double quotes are string = brunch of char

        char c2 = 'B';
        char c3 = '!';
        char c4 = '@';
        char c5 = '#';
        char c6 = '%';
        char c7 = '&';
        char c8 = '(';
        char c9 = ' '; // blank space

        // Escape Char

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("manojkumar");
        System.out.println("manoj\nkumar");
        System.out.println("manoj\tkumar");
        System.out.println("manoj\bkumar");
        System.out.println("manoj\rkumar");
        System.out.println("manoj is the first line\nkumar is the second line");
    }
}
