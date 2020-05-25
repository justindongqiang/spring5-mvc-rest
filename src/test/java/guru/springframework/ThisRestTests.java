package guru.springframework;

import com.fasterxml.jackson.databind.JsonNode;
import guru.springframework.controllers.v1.CategoryController;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
public class ThisRestTests {
    private static final String ROOT_URL = "http://localhost:8080/api/v1/categories";

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetAllCategories() throws Exception {
        String apiUrl = ROOT_URL;
        RestTemplate restTemplate = new RestTemplate();
        JsonNode jsonNode = restTemplate.getForObject(apiUrl, JsonNode.class);
        System.out.println("Response");
        System.out.println(jsonNode.toString());
    }
}
