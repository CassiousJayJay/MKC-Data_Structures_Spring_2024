public class Main{
    public static void main(String[] args){
        Circle obj = new Circle(4.5);
        System.out.println(obj.getRadius());

        obj.setRadius(10.5);
        System.out.println(obj.getRadius());


        Rectangle recHeight = new Rectangle(15.6, 17.5);
        System.out.println("Origin Height: " + recHeight.getHeight());

        System.out.println("Origin Width: " + recHeight.getWidth());

        recHeight.setHeight(20.5);
        System.out.println("New Height: " + recHeight.getHeight());

        recHeight.setWidth(12.4);
        System.out.println("New Width: " + recHeight.getWidth());

    //Area of a Rectangle
        System.out.println("Area of a rectangle: " + recHeight.calculateArea());
        System.out.printf("Area of a rectangle: %.3f\n", recHeight.calculateArea());

        //Area of a Circle
        System.out.printf("Area of a Circle: %.3f\n", obj.calculateArea());

        Printable x = new PrintableCircle(20.4);
        x.print();

        Printable y = new PrintableRectangle(15.3, 22.3);
        y.print();


    }
}