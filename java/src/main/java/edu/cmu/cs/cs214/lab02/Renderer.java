package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Дүрс зурах Renderer класс
 * ЗАСВАР: Тодорхой Rectangle класс дээр хамааралтай байснаас Shape interface ашиглах болгосон
 * ЗАСВАР: shape талбарыг public-аас private болгосон
 * Одоо зөвхөн Rectangle биш ямар ч Shape хэрэгжүүлэлттэй ажиллах боломжтой
 */
public class Renderer {
    private Shape shape;  // ЗАСВАР: "public Rectangle rectangle"-аас "private Shape shape" болгосон
    
    public Renderer(Shape shape) {  // ЗАСВАР: Параметр Rectangle-аас Shape болсон
        this.shape = shape;
    }
    
    public void draw() {
        double area = shape.getArea();  // ЗАСВАР: Shape interface-ийн getArea() дуудаж байна
        // assume implementation
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
