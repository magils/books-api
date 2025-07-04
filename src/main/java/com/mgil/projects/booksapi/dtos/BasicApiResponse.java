package com.mgil.projects.booksapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class BasicApiResponse<T> {
    private String responseErrorCode = "OK";
    private T payloadResponse;

    public BasicApiResponse() {
    }

    public BasicApiResponse(String responseErrorCode, T payloadResponse) {
        this.responseErrorCode = responseErrorCode;
        this.payloadResponse = payloadResponse;
    }

    public String getResponseErrorCode() {
        return responseErrorCode;
    }

    public void setResponseErrorCode(String responseErrorCode) {
        this.responseErrorCode = responseErrorCode;
    }

    public T getPayloadResponse() {
        return payloadResponse;
    }

    public void setPayloadResponse(T payloadResponse) {
        this.payloadResponse = payloadResponse;
    }
}
