package com.ll.dynamodb_2023;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final DynamoDBService dynamoDBService;

    @GetMapping("/test")
    public List<MyClass> findAll() {
        return dynamoDBService.getAllItems("hello");
    }

    @GetMapping("/test2")
    public MyClass findById() {
        return dynamoDBService.getItem("hello", 200L);
    }

    @GetMapping("/test3")
    public MyClass save() {
        MyClass data = MyClass.builder()
                .id(200L)
                .name("hello" + 200)
                .password("hello" + 200)
                .build();
        dynamoDBService.putItem("hello", data);
        return data;
    }
}