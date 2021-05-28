package practice05_17_2021;

public class RectangleTask {
    double height;
    double width;
    double area;

    public void setDimensions(double recHeight ,double recWidth){
        height = recHeight;
        width = recWidth;
        area = height * width;


    }
    public double getArea(){
        area = height * width;
        return area ;
    }

    @Override
    public String toString() {
        return "RectangleTask{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
