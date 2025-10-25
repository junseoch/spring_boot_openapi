package com.app.openapi;

import com.app.openapi.service.OpenApiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootTest
class OpenapiApplicationTests {

    @Autowired
    private final OpenApiService openApiService;

    @Test
    public void fetchTest(){
        try {
            openApiService.getTripResponse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
