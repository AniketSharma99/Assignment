class Rectangle extends Shape {
    @Override
    public String draw()
    {
    	return "It is rectangle";
    }
}

class Squar extends Shape{
    @Override
    public String draw() 
    {
    	return "It is Squar";
    }
}

class Cube extends Shape {
    @Override
    public String draw() 
    {
    	return "It is cube";
    }
}
abstract class Shape {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) 
    {
    	Rectangle r=new Rectangle();
    	Squar l=new Squar();
    	Cube c=new Cube();
    	String a,b,o;
    	a=r.draw();
    	b=l.draw();
    	o=c.draw();
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(o);
    }
}