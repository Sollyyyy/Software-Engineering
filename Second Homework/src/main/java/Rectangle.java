public class Rectangle {
    double length;
    double width;
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return this.length * this.width;
    }
}
