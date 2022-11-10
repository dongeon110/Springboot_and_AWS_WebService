package com.dongeon110.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
@Getter // 1.
@RequiredArgsConstructor // 2. 모든 final 필드가 포함된 생성자 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
