package com.app.openapi.service;

import com.app.openapi.domain.dto.trip.Item;
import com.app.openapi.domain.dto.trip.Items;
import com.app.openapi.domain.dto.trip.TripResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@Service
@Slf4j
public class OpenApiService {

    // 환경 변수 값
    @Value("${api.base-url}")
    private String baseUrl = "test";

    @Value("${api.service-key}")
    private String serviceKey = "test";

    public Items getTripResponse() throws IOException, URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        String fullUrl = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("serviceKey", serviceKey)
                .queryParam("numOfRows", "10")
                .queryParam("pageNo", "3")
                .queryParam("keyword", "")
                .queryParam("type", "json")
                .build()
                .toString();

        URI uri =  new URI(fullUrl);
        log.info("fullUrl : {}", fullUrl);
        TripResponseDTO response = restTemplate.getForObject(uri, TripResponseDTO.class);
        return response.getBody().getItems();

    }



}









