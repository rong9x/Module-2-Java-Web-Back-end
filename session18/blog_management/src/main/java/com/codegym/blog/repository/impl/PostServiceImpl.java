package com.codegym.blog.repository.impl;

import com.codegym.blog.model.Post;
import com.codegym.blog.repository.IPostRepository;
import com.codegym.blog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements IPostService {

    @Autowired
    private IPostRepository postRepository;

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void remove(Long id) {
        postRepository.remove(id);
    }
}
