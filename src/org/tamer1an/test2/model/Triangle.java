package org.tamer1an.test2.model;

import org.tamer1an.test2.aspect.Loggable;

public class Triangle {
	
	private String name;

	public String getName() {
		return name;
	}
	@Loggable
	public void setName(String name) {
		this.name = name;
	}
	

}
