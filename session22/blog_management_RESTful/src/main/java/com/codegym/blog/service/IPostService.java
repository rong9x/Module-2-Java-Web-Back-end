package com.codegym.blog.service;

import com.codegym.blog.model.Post;

import java.util.List;

public interface IPostService {
    List<Post> findAll();

    Post findById(Long id);

    void save(Post post);

    void remove(Long id);
}
