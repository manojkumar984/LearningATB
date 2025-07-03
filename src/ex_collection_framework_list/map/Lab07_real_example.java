package ex_collection_framework_list.map;

import java.util.HashMap;
import java.util.Map;

public class Lab07_real_example {
    public static void main(String[] args) {

        Map<String, String> envConfig = new HashMap<>();
        envConfig.put("production","https://prod.api.com");
        envConfig.put("staging","https://staing.api.com");

        // managing user credentials
        Map<String,String> creentials = new HashMap<>();
        creentials.put("admin","admin123");
        creentials.put("user","user123");
    }
}
