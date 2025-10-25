package com.app.openapi.domain.dto.trip;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

// "numOfRows": "string",
//         "pageNo": "string",
//         "totalCount": "string"
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {

    @JsonProperty("items")
    private Items item;
    private String numOfRows;
    private String pageNo;
    private String totalCount;

}
