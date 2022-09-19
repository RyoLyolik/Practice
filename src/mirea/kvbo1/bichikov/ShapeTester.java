package mirea.kvbo1.bichikov;

public class ShapeTester {
    public void test(){
        Circle c = new Circle(0,0,1);
        Rectangle r = new Rectangle(3,4);
        Square s = new Square(5);

        System.out.println(c);
        System.out.println("Area: "+c.getArea() + " Perimeter: " + c.getPerimeter());
        System.out.println();
        System.out.println(r);
        System.out.println("Area: "+r.getArea() + " Perimeter: " + r.getPerimeter());
        System.out.println();
        System.out.println(s);
        System.out.println("Area: "+s.getArea() + " Perimeter: " + s.getPerimeter());
    }
}
