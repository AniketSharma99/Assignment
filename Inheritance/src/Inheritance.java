// Inheritance OOPs
import java.io.*;
import java.util.*;
//Base class shape
class Shape{
	public void area() {
		System.out.println("display area");
	}
}
// Child class of shape 
class Traingle extends Shape{
 public void areat(float l,float h) {
	 System.out.println((l*h)/2);
}
}
//Equilateral is inherited from triangle
 class 	EquilateralTriangle extends Traingle{
	 public void areae(int l,int h) {
		 System.out.println(l);
		 
	 }
}
public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilateralTriangle t1= new EquilateralTriangle ();
		t1.area();//calling first class
		t1.areat(4, 2);	//calling second class
		t1.areae(10, 0);//the third class
	}
}
