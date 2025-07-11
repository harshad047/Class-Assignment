package com.tss.model;

public class Chair implements IFurniture {

	private String style;

	public Chair(String style) {
		super();
		this.style = style;
	}

	@Override
	public void describe() {
		System.out.println("This is a " + style + " chair.");
	}

}
