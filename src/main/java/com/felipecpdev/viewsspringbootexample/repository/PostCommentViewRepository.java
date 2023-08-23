package com.felipecpdev.viewsspringbootexample.repository;

import com.felipecpdev.viewsspringbootexample.entity.PostCommentView;

import java.util.List;

public interface PostCommentViewRepository extends ReadOnlyRepository<PostCommentView,String>{
    List<PostCommentView> findByAuthor(String author);
}
