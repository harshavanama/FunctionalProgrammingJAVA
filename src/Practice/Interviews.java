package Practice;

public class Interviews {
    public static void main(String[] args) {


    }
}

class Shape{
    private int length;
    private int breadth;

    public Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        System.out.println(length + " " + breadth);
    }
}

class Rectangle extends Shape{

    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    @Override
    public void area() {
        super.area();
    }
}
