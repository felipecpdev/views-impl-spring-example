package com.felipecpdev.viewsspringbootexample.repository;

import com.felipecpdev.viewsspringbootexample.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post,Long> {

}
