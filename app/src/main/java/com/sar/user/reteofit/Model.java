package com.sar.user.reteofit;

import com.google.gson.annotations.SerializedName;

public class Model {
    public String getColor() {
        return color;
    }

    public String getValue() {
        return value;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @SerializedName("color")
    private String color;
    @SerializedName("value")
    private String value;
}
