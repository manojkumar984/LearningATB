package ex_22_Enum;

public enum Lab05_APIURLS {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Lab05_APIURLS(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

}
