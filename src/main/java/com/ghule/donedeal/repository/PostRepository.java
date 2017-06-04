package com.ghule.donedeal.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghule.donedeal.domain.Post;

public interface PostRepository extends JpaRepository<Post, Serializable> {

}
