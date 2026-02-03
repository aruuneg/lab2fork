package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Rectangle дүрсний хэрэгжүүлэлт
 * ЗАСВАР: height болон width талбаруудыг public-аас private болгосон
 * Гадны классууд дотоод талбар руу шууд хандах боломжгүй болсон
 */
public class Rectangle implements Shape {
    private double height;  // ЗАСВАР: public-аас private болгосон
    private double width;   // ЗАСВАР: public-аас private болгосон
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return height * width;
    }
}
