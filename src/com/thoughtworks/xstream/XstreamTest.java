package com.thoughtworks.xstream;
public class XstreamTest {
	private String name;
	private String description;

	public XstreamTest(String n, String d){
		name = n;
		description = d;
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}
	
	public void setDescription(String d){
		description = d;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String toString(){
		return name + description;
	}
}
