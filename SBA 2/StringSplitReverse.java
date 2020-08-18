package com.mytask.assessment2;

public class StringSplitReverse {
	
void stringSplitReverse(String data) {
		
		String[] str=data.split(" ");
		for(int i=0; i<str.length;i++) {
			
			int j=0;
			char[] arr = str[i].toCharArray();
			char[] arr1 = new char[arr.length];
			for (int p = arr.length - 1; p >= 0; p--) {
				arr1[j]=arr[p];
				j++;
	
			}
			String manstr = new String(arr1);
			System.out.println(manstr);
			
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringSplitReverse stringSplitReverse=new StringSplitReverse();
		stringSplitReverse.stringSplitReverse("This is Java Programming");

	}

}
