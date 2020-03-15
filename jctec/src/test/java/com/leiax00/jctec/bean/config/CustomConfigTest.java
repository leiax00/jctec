package com.leiax00.jctec.bean.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.json.JsonMapper;
import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/*基于junit5的springboot测试用例书写*/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class CustomConfigTest {
    private CustomConfig config;

    @Autowired
    public void setConfig(CustomConfig config) {
        this.config = config;
    }

    @Test
    public void loadPropertiesInBean() throws IOException {
        System.out.println(this.config);
    }

    @Test
    public void loadJson() throws IOException {
        File file = ResourceUtils.getFile("classpath:test.json");
        String s = FileUtils.readFileToString(file, Charset.defaultCharset());
        System.out.println(s);
        Demo demo = new JsonMapper().readValue(file, Demo.class);
        System.out.println(demo);
    }
}

@Data
class Demo {
    @JsonProperty("a")
    private String aa;

    @JsonProperty("b")
    private String bb;

    @JsonProperty("c")
    private Map<String, String> cc;

}
