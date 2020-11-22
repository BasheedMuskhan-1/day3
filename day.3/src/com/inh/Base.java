package com.inh;
import java.util.Scanner;

 public class Base
{
  static int a;
  static int b;
}
  class Derived extends Base
  {
  public void dispMax()
  {
  if(a>b)
  {
  System.out.println(a);
  }
   else
     {
      System.out.println(b);
     }
  }
  public void dispMin()
  {
   if(a<b)
    {
      System.out.println(a);
    }
    else
  {
  System.out.println(b);
  }
 }
}
  
 public class Main3
 {
     public static void main(String[] args)
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("enter 2 numbers:");
           Base.a=sc.nextInt();
           Base.b=sc.nextInt();
           Derived d=new Derived();
           d.dispMax();
           d.dispMin();
        }

}

 
