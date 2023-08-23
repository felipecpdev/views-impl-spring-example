package com.felipecpdev.viewsspringbootexample.services;

import com.felipecpdev.viewsspringbootexample.entity.PostCommentView;
import com.felipecpdev.viewsspringbootexample.entity.PostSummary;

import java.util.List;

public interface PostService {
    List<PostCommentView> postCommentViewList();
    List<PostSummary> postSummaryList();

}
