package com.app.openapi.domain.dto.trip;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Body {
    //    @JsonProperty("items")
//    key가 다를 때 사용
    private Items items;
    private String numOfRows;
    private String pageNo;
    private String totalCount;
}
