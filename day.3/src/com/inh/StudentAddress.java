package com.inh;

public class StudentAddress
{
	String name;
	int rollno;
	public void display()
	{
		System.out.println(name+" "+rollno+" ");
	}
}
class Record extends StudentAddress
{
	String address;

 public void display()
  {
	System.out.println(name+" "+rollno+" "+address);
  }
}