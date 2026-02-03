package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Circle дүрсний хэрэгжүүлэлт
 * ЗАСВАР: radius талбарыг public-аас private болгосон
 */
public class Circle implements Shape {
    private double radius;  // ЗАСВАР: public-аас private болгосон
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
