package com.felipecpdev.viewsspringbootexample.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import java.io.Serializable;

@Entity
@Immutable
@Subselect("SELECT * FROM post_summary")
public class PostSummary implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String author;

    private Long commentCount;

    public PostSummary() {
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
