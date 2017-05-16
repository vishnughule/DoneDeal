package com.ghule.donedeal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ghule.donedeal.domain.Post;
import com.ghule.donedeal.service.PostService;

@Service
public class PostServiceImpl implements PostService {

	public List<Post> getPosts() {
		List<Post> posts = new ArrayList<Post>();
		Post post1 = new Post(1, "White House is giving 30% off on entire store from 31st may to June 7th");
		Post post2 = new Post(1, "White House is giving 30% off on entire store from 31st may to June 7th");
		posts.add(post1);
		posts.add(post2);
		return posts;
	}

}
