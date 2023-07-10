package com.ll.dynamodb_2023.domain.controller;

import com.ll.dynamodb_2023.domain.entity.Post;
import com.ll.dynamodb_2023.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/create")
    @ResponseBody
    public Post create() {
        return postService.write("제목");
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Post> posts() {
        return postService.findAll();
    }
}