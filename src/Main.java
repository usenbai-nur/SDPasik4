public class Main {
    public static void main(String[] args) {
        Shape whiteCircle = new Circle(new WhiteColor());
        Shape blueSquare = new Square(new BlueColor());
        whiteCircle.draw();
        blueSquare.draw();
    }
}
