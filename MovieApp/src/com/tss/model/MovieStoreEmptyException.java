package com.tss.model;

public class MovieStoreEmptyException extends RuntimeException{
	
	public String getMessage()
	{
		return "Movie Store is Empty";
	}

}
