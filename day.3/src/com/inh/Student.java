package com.inh;

public class Student
{
	String name;
	int rollno;
	int marks;
	public void display()
	{
		System.out.println(name+" "+rollno+" "+marks);
	}
}
class MyRecord extends Student
{
	double percentage;
	public void percentagecalculation()
	{
		percentage=(marks/100)*100;
	}
 public void display()
  {
	System.out.println(name+" "+rollno+" "+marks+" "+percentage+" ");
  }
}

