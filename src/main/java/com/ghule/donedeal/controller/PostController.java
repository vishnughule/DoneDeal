package com.ghule.donedeal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghule.donedeal.domain.Post;
import com.ghule.donedeal.service.impl.PostServiceImpl;

@RestController
@RequestMapping("post")
public class PostController {

	@Autowired
	private PostServiceImpl postService;

	/**
	 * This method is to return all the post from the system
	 * 
	 * @return
	 */
	@GetMapping
	public List<Post> getPosts() {
		List<Post> posts = null;
		posts = postService.getPosts();
		return posts;

	}
}
