package com.felipecpdev.viewsspringbootexample.services.impl;

import com.felipecpdev.viewsspringbootexample.entity.PostCommentView;
import com.felipecpdev.viewsspringbootexample.entity.PostSummary;
import com.felipecpdev.viewsspringbootexample.repository.PostCommentViewRepository;
import com.felipecpdev.viewsspringbootexample.repository.PostSummaryRepository;
import com.felipecpdev.viewsspringbootexample.services.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    private final PostCommentViewRepository postCommentViewRepository;
    private final PostSummaryRepository postSummaryRepository;

    public PostServiceImpl(PostCommentViewRepository postCommentViewRepository, PostSummaryRepository postSummaryRepository) {
        this.postCommentViewRepository = postCommentViewRepository;
        this.postSummaryRepository = postSummaryRepository;
    }

    @Override
    public List<PostCommentView> postCommentViewList() {
        return postCommentViewRepository.findAll();
    }

    @Override
    public List<PostSummary> postSummaryList() {
        return postSummaryRepository.findAll();
    }
}
