package com.codegym.blog.controller;

import com.codegym.blog.model.Post;
import com.codegym.blog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private IPostService postService;

    @GetMapping("/posts/")
    public ResponseEntity<List<Post>> showListPosts(){
        List<Post> posts = postService.findAll();
        if (posts.isEmpty())
            return new ResponseEntity<List<Post>>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<List<Post>>(posts, HttpStatus.OK);
    }

    @GetMapping(value = "/posts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Post> getPost(@PathVariable Long id){
        Post post = postService.findById(id);
        if (post == null)
            return new ResponseEntity<Post>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<Post>(post, HttpStatus.OK);
    }

    /*@GetMapping("/create-post")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("post/create");
        modelAndView.addObject("post", new Post());
        return modelAndView;
    }

    @PostMapping("/create-post")
    public ModelAndView createPost(@ModelAttribute("post") Post post){
        postService.save(post);

        ModelAndView modelAndView = new ModelAndView("post/create");
        modelAndView.addObject("post", new Post());
        modelAndView.addObject("message", "New post created successfully!");
        return modelAndView;
    }

    @GetMapping("/edit-post/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Post post = postService.findById(id);
        if (post != null) {
            ModelAndView modelAndView = new ModelAndView("post/edit");
            modelAndView.addObject("post", post);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-post")
    public ModelAndView updatePost(@ModelAttribute("post") Post post){
        postService.save(post);

        ModelAndView modelAndView = new ModelAndView("post/edit");
        modelAndView.addObject("post", post);
        modelAndView.addObject("message", "Update post successfully!");
        return modelAndView;
    }

    @GetMapping("/delete-post/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id){
        Post post = postService.findById(id);
        if (post != null) {
            ModelAndView modelAndView = new ModelAndView("post/delete");
            modelAndView.addObject("post", post);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-post")
    public String deletePost(@ModelAttribute("post") Post post, RedirectAttributes redirectAttributes){
        postService.remove(post.getId());
        redirectAttributes.addFlashAttribute("deleteMessage", "Deleted post successfully!");
        return "redirect:posts/";
    }*/
}
