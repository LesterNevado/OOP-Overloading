public class AreaCalculator{
    public Double computeArea(Double side1, Double side2){
        Double rectangle = 0.0;
        rectangle = side1 * side2;
        return rectangle;
    }

    public Double computeArea(Double side){
        return side*side;
    }

    public Double computeArea(String circle, Double radius){
        if (circle.equals("circle"))
            return 3.1416 * radius;
        else
            return 0.0;
    }

}