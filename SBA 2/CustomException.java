package com.mytask.assessment2;

public class CustomException extends RuntimeException {

	
	public CustomException() {
		super("Please Enter Valid Marks between 0 and 100");
		}
		
	
	public static void main(String[] args) {
		
		
		Marks a=new Marks();

		try{
		a.Stumarks(50);
		}
		catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e);
		}

	}

}
		
