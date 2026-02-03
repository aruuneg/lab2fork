package edu.cmu.cs.cs214.lab02.shapes;

/**
 * Square дүрсний хэрэгжүүлэлт
 * ЗАСВАР: sideLen талбарыг public-аас private болгосон
 */
public class Square implements Shape {
    private double sideLen;  // ЗАСВАР: public-аас private болгосон
    
    public Square(double sideLen) {
        this.sideLen = sideLen;
    }
    
    @Override
    public double getArea() {
        return sideLen * sideLen;
    }
}
