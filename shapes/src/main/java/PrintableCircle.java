public class PrintableCircle extends Circle implements Printable {
    public PrintableCircle(double radius){
        super(radius);

    }

    @Override
    public void print() {
        System.out.println("Printing the circle with radius: " + this.getRadius());

    }
}
