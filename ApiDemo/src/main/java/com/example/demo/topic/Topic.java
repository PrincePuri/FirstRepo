package com.example.demo.topic;

public class Topic {

	private String id;
	private String name;
	private String description;
	
	public Topic(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		
		this.id = string;
		this.name = string2;
		this.description = string3;
	}
	
	
	public Topic() {
		super();
System.out.println("hi");
		// TODO Auto-generated constructor stub
	}


	/*
	 * Topic(String id, String name, String description) { super(); this.id = id;
	 * this.name = name; this.description = description; }
	 */
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

//heybuddy
        

}
