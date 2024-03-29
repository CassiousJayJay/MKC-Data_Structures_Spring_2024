public class Circle extends Shape{
    private final double PI = 3.14;
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }
        public double getRadius(){
            return this.radius;
        }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
            return Math.PI * Math.pow(this.radius, 2);
    }
}

