abstract class Shape {                // main class 
    private String color;

    Shape ( String color){
        this.color=color;
    }

    abstract double area ();
    abstract  double perimeter ();

}







class Circle extends Shape {            

    private double radius;

    Circle(String color, double radius) {
        super(color);

        if (radius <= 0) {
            System.out.print("Invalid");
            return;
        }

        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14 * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * radius;
    }
}








class Rectangle extends Shape {              
                                                    
    private double length;                                         
    private double width;                                   

    Rectangle(String color,double length, double width) {
        super(color);

        if (length <= 0 || width <= 0) {
            System.out.print("Invalid dimensions");
            return;
        }
                                                   
        this.length = length;
        this.width = width;
    }
                                                                       
    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}






class Square extends Shape {

    private double side;

    Square(String color, double side) {
        super(color);

        if (side <= 0) {
            System.out.print("Invalid side");
            return;
        }

        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

