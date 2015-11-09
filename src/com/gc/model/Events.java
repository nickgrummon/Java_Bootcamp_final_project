package com.gc.model;

import java.io.Serializable;

public class Events implements Serializable {

	private String date;
	private String name;
	private String type;
	private String location;
	private String description;
	private String price;
	private String link;

	public Events(String date2, String name2, String type2, String location2, String description2, String price2,
			String link2) {

		this.date = date2;
		this.name = name2;
		this.type = type2;
		this.location = location2;
		this.description = description2;
		this.price = price2;
		this.link = link2;
	}

	public Events() {
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}