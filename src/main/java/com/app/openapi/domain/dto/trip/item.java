package com.app.openapi.domain.dto.trip;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;

//  "publisher": "string",
//          "creator": "string",
//          "collectionDb": "string",
//          "insertDate": "string",
//          "title": "string",
//          "description": "string",
//          "referenceIdentifier": "string",
//          "url": "string",
//          "viewCnt": "string",
//          "reference": "string",
//          "spatialCoverage": "string"
@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class item {

    private String publisher;
    private String creator;
    private String collectionDb;
    private String insertDate;
    private String title;
    private String description;
    private String referenceIdentifier;
    private String url;
    private String viewCnt;
    private String reference;
    private String spatialCoverage;

}
