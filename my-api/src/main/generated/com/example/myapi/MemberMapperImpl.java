package com.example.myapi;

import com.example.mydomain.MemberDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-13T18:39:21+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-4.10.jar, environment: Java 1.8.0_402 (Amazon.com Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberDto toMemberDto(MemberRequest request) {
        if ( request == null ) {
            return null;
        }

        String arg0 = null;
        Integer arg1 = null;

        MemberDto memberDto = new MemberDto( arg0, arg1 );

        return memberDto;
    }
}
