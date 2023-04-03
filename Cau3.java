package Lab8;

public interface Shape {
    void draw();
public class Rectangle implements Shape
{
    @Override
    public void draw(){
        System.out.println("draw");
    }
}
public class Circle implements Shape
{
    @Override
    public void draw(){
        System.out.println("draw");
    }
}
public class Main{
public static void main(String[] args) {
    Rectangle hcn = new Rectangle();
    hcn.draw();
    Circle ht = new Circle();
    ht.draw();
}
}
}

