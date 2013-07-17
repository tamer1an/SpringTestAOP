package org.tamer1an.test2.model;

import org.tamer1an.test2.aspect.Loggable;

public class Circle {
	
	private String name;
	
	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
