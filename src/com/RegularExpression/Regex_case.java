package com.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_case {

	
	

	public static void main(String[] args ){
		// step 1
		String src =" My pan number is BDPPC1998A";
	String Pat ="[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		
		
		// step 2
		
	     Pattern ptr = Pattern.compile(Pat);
		Matcher matcher = ptr.matcher(src);
		if (matcher.find())
		{
			System.out.println("pattern exit");
			System.out.println("matcher.group()");
		}
		else
		{
			System.out.println("pattern not  exit");
		}
		
		

	}

}


