package com.example.JobList.controller;

import com.example.JobList.repository.PostRepository;
import com.example.JobList.models.Post;
import com.example.JobList.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/allPosts/{Text}")
    public List<Post> searchPostText(@PathVariable String Text){
        return searchRepository.findByText(Text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return postRepository.save(post);
    }



}
