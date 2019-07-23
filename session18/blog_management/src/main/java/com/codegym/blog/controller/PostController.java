package com.codegym.blog.controller;

import com.codegym.blog.model.Post;
import com.codegym.blog.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class PostController {

    @Autowired
    private IPostService postService;

    @GetMapping("/posts")
    public ModelAndView showListPosts(){
        List<Post> posts = postService.findAll();
        ModelAndView modelAndView = new ModelAndView("post/list");
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }

    @GetMapping("/create-post")
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
    }

    @GetMapping("/view-post/{id}")
    public ModelAndView showDetailPost(@PathVariable Long id){
        Post post = postService.findById(id);
        if (post != null) {
            ModelAndView modelAndView = new ModelAndView("post/detail");
            modelAndView.addObject("post", post);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error404");
            return modelAndView;
        }
    }
}
