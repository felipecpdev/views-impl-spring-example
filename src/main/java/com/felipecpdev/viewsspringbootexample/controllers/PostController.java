package com.felipecpdev.viewsspringbootexample.controllers;

import com.felipecpdev.viewsspringbootexample.entity.PostCommentView;
import com.felipecpdev.viewsspringbootexample.entity.PostSummary;
import com.felipecpdev.viewsspringbootexample.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/view-example")
    public ResponseEntity<?> readView() {
        List<PostCommentView> list = postService.postCommentViewList();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/materialized-view-example")
    public ResponseEntity<?> readMaterializedView() {
        List<PostSummary> list = postService.postSummaryList();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
