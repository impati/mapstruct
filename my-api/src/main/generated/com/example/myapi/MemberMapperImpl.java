package com.example.myapi;

import com.example.mydomain.MemberDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-13T18:04:01+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-4.10.jar, environment: Java 1.8.0_402 (Amazon.com Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberDto toMemberDto(MemberRequest request) {
        if ( request == null ) {
            return null;
        }

        String name = null;
        Integer age = null;

        name = request.getName();
        age = request.getAge();

        MemberDto memberDto = new MemberDto( name, age );

        return memberDto;
    }
}
