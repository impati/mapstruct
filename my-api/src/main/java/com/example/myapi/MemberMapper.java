package com.example.myapi;

import com.example.mydomain.MemberDto;
import org.mapstruct.Mapper;

@Mapper
public interface MemberMapper {

    MemberDto toMemberDto(MemberRequest request);
}
