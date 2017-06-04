package com.ghule.donedeal.domain;

public class Post {

	private Integer id;

	private String postContent;

	private Integer status;

	private Integer zipCode;

	private CommonRowDetails commonRowDetails;

	public Post() {
		// TODO Auto-generated constructor stub
	}

	public Post(Integer id, String postContent) {
		this.id = id;
		this.postContent = postContent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public CommonRowDetails getCommonRowDetails() {
		return commonRowDetails;
	}

	public void setCommonRowDetails(CommonRowDetails commonRowDetails) {
		this.commonRowDetails = commonRowDetails;
	}

}
