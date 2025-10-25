package com.app.openapi.service;

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

    @org.springframework.beans.factory.annotation.Value("${api.base-url}")
    private String baseurl;

    @Value("${api.service-key}")
    private String serviceKey;

    public void getTripResponse()throws IOException, URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();

        String fullUrl = UriComponentsBuilder.fromHttpUrl(baseurl)
                .queryParam("servicekey", serviceKey)
                .build()
                .toUriString();

        URI uri = new URI(fullUrl);

        TripResponseDTO response =  restTemplate.getForObject(uri, TripResponseDTO.class);

    }

}
