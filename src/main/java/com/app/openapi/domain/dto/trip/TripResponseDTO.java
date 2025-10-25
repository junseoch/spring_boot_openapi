package com.app.openapi.domain.dto.trip;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

// xml로 응답하는 경우
@Data
@XmlRootElement(name="response")
@XmlAccessorType(XmlAccessType.FIELD)
public class TripResponseDTO {

    private Header header;
    private Body body;

}
