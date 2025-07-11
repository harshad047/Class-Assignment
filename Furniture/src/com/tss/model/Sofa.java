package com.tss.model;

public class Sofa implements IFurniture{
	private String style;
	public Sofa(String style) {
		super();
		this.style = style;
	}
	@Override
	public void describe() {
        System.out.println("This is a " + style + " sofa.");
	}

}
