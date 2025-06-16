package ex_22_Enum;

public class Lab03_Enum_Colours {
    public static void main(String[] args) {
        System.out.println(colours.RED.getHexCode());
        System.out.println(colours.YELLOW.getHexCode());
    }
}

enum colours {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexCode;

    colours(String hexCode) {
        this.hexCode = hexCode;
    }

    String getHexCode() {
        return hexCode;
    }
}
