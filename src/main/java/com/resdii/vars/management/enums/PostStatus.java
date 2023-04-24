package com.resdii.vars.management.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum PostStatus {
    PENDING("pending"),
    PUBLISH("publish"),
    EXPIRED("expired");

    public String value;
    PostStatus(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public static List<String> listOfValues(){
        List<PostStatus> items = Arrays.asList(values());
        return items.stream().map(item->item.value).collect(Collectors.toList());
    }
}
