package com.ghule.donedeal.domain;

public class TypeRef {

	private Integer id;

	private String desc;

	private CommonRowDetails commonRowDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public CommonRowDetails getCommonRowDetails() {
		return commonRowDetails;
	}

	public void setCommonRowDetails(CommonRowDetails commonRowDetails) {
		this.commonRowDetails = commonRowDetails;
	}

}
