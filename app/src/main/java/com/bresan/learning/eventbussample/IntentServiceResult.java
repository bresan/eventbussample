package com.bresan.learning.eventbussample;

/**
 * Created by rodrigobresan on 6/15/16.
 */
public class IntentServiceResult {
    public int mResult;
    public String mResultValue;

    public IntentServiceResult(int result, String resultValue) {
        this.mResult = result;
        this.mResultValue = resultValue;
    }

    public int getmResult() {
        return mResult;
    }

    public void setmResult(int mResult) {
        this.mResult = mResult;
    }

    public String getmResultValue() {
        return mResultValue;
    }

    public void setmResultValue(String mResultValue) {
        this.mResultValue = mResultValue;
    }
}
