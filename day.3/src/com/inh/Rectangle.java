package com.inh;

class Rectangle
{
    int length;
    int width;
    Rectangle(int length,int width)
       {
         this.length=length;
         this.width=width;
       }
          double getArea()
           {
             return length*width;
           }
}
class Box extends Rectangle 
{
      int depth;
      public Box(int depth)
         {
           super(12,12);
           this.depth=depth;
         }
}
 public class Main4
 {

public static void main(String[] args) {
// TODO Auto-generated method stub
     Box b=new Box(10);
     System.out.println(b.length+"-"+b.width+"-"+b.getArea()+"-"+b.depth);

}
 
}

