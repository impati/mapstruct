package com.example.mydomain;

import lombok.Getter;

@Getter
public class MemberDto {

    private final String name;
    private final Integer age;

    public MemberDto(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
