package com.app.openapi.domain.dto.trip;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

// xml로 응답

@Data
@XmlRootElement(name="response") // xml의 루트 이름
@XmlAccessorType(XmlAccessType.FIELD)
public class TripResponseDTO {
    private Header header;
    private Body body;
}
