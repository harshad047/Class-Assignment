package com.tss.model;

public class Table implements IFurniture{
	private String style;
	
	public Table(String style) {
		super();
		this.style = style;
	}

	@Override
	public void describe() {
        System.out.println("This is a " + style + " table.");
	}

}
