public class Main {

    public static void main(String[] args){
        ShapePrinter shapePrinter = new ShapePrinter();
         Shape quad = new Quad();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();
        Shape rectangle = new Rectangle();

        shapePrinter.shapePrintName(quad);
        shapePrinter.shapePrintName(circle);
        shapePrinter.shapePrintName(triangle);
        shapePrinter.shapePrintName(hexagon);
        shapePrinter.shapePrintName(rectangle);
    }
}
