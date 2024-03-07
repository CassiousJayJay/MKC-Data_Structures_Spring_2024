public class PrintableRectangle extends Rectangle implements Printable{
    public PrintableRectangle(double width, double height){

         super(width, height);
    }

    @Override
    public void print() {
        System.out.println("Printing rectangle with width: " + getWidth() + " and height: " + getHeight());

    }
}