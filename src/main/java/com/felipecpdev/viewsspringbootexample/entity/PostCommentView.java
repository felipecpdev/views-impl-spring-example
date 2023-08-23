package com.felipecpdev.viewsspringbootexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.io.Serializable;

@Entity
@Immutable
@Subselect("SELECT * FROM post_comment_view")
public class PostCommentView implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String author;
    private Long commentCount;

    public PostCommentView() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}
