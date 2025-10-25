package com.app.openapi.domain.dto.trip;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

//   "resultCode": "string",
//           "resultMsg": "string"
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Header {
    private String resultCode;
    private String resultMsg;

}
