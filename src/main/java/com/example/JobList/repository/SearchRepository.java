package com.example.JobList.repository;

import com.example.JobList.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
