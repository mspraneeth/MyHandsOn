package com.mytask.assessment2;

public class Marks {

	void Stumarks(int Marks)throws CustomException
	{
	if(Marks > 100)
	throw new CustomException();

	else
	System.out.println(Marks+" Marks are valid");
}
}