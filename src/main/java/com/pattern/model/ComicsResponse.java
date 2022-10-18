package com.pattern.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ComicsResponse {
    private String copyright;
    private String attributionText;
    private String data;
}
