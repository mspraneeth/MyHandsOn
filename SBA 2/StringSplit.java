package com.mytask.assessment2;

public class StringSplit {
	
	
	void stringSplit(String data) {
		
		
		String[] str=data.split(" ");
		for(String a:str) {
			System.out.println(a);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSplit stringSplit=new StringSplit();
		stringSplit.stringSplit("This is Java Programming");
		

	}

}
