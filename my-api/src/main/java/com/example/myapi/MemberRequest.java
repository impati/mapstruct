package com.example.myapi;

import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public class MemberRequest {

    private final String name;
    private final Integer age;

    public MemberRequest(String name, @Nullable Integer age) {
        this.name = name;
        this.age = age;
    }
}
