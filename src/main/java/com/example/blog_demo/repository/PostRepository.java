package com.example.blog_demo.repository;

import com.example.blog_demo.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface PostRepository extends CrudRepository<Post, Long>
{
}
