package com.example.mydomain;

import lombok.Getter;
import org.springframework.lang.Nullable;

@Getter
public class MemberDto {

    private final String name;
    private final Integer age;

    public MemberDto(String name, @Nullable Integer age) {
        this.name = name;
        this.age = age;
    }
}
