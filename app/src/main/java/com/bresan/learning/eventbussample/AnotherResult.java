package com.bresan.learning.eventbussample;

/**
 * Created by rodrigobresan on 6/15/16.
 */
public class AnotherResult {
    private int resultCode;
    private String message;

    public AnotherResult(int resultCode, String message) {
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
