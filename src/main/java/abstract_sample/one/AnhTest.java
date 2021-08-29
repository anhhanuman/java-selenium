package abstract_sample.one;
/*
a default access modifier abstract class named Shape (If you make the public class,you have to create a class called Shape.java
we have a public constructor Shape(), an abstract method called draw()
you can remove the constructor Shape() without worrying about error(?)
a public abstract method draw() which does not have body. The implementation of this method has to  be provided by the derived class (child class)

*/
 abstract class Shape {
    private String color = "red";

    public Shape() {
    }
    public abstract void draw();
    public String getColor(){
        return color;
    }
}
/*
An error saying: abstract class must be declared or have to implement the abstract method draw() in
the class Shape()
So, the child class Rectangle has to implement the abstract method by using @Override
 */

class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("hello");
    }
}
public class AnhTest {
    public static void main(String[] args)
    {
        System.out.println("hello method");

    }
}

