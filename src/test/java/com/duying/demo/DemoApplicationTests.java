package com.duying.demo;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        String jsonStr = "{\"hello\":\"你好\"}";
        Gson gson = new Gson();
        Map map = gson.fromJson(jsonStr, Map.class);

        System.out.println(map);
    }

}
