package com.tss.model.inheritance.test;

import com.tss.model.inheritance.model.NewCircle;
import com.tss.model.inheritance.model.NewRectangle;

public class IshapeTest {

	public static void main(String[] args) {

		NewCircle circle = new NewCircle(4.5);
		NewRectangle rectangle = new NewRectangle(10, 20);

		circle.area();
		rectangle.area();

	}

}
