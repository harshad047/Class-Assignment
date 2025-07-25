package com.tss.test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class email {
	
	    public static void main(String[] args) {
	        List<String> emails = List.of(
	            "harshad@gmail.com",
	            "mahek@yahoo.com",
	            "ashish@outlook.com",
	            "rishit@gmail.com",
	            "deeps@deepr.com",
	            "deepr@smashcart.com"
	        );

	        Set<String> uniqueEmails = emails.stream()
	            .map(email -> email.substring(email.indexOf("@") + 1)) 
	            .collect(Collectors.toSet()); 
	        
	        System.out.println(uniqueEmails);
	    }
	}

