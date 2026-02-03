package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

/**
 * Main класс
 * ЗАСВАР: Тодорхой Rectangle төрөл биш Shape interface ашиглах болгосон
 * Одоо Main нь Rectangle-ийн хэрэгжүүлэлтийн дэлгэрэнгүй мэдээлэлд хамааралгүй болсон
 */
public class Main {
    public static void main(String[] args) {
        // ЗАСВАР: Хувьсагчийн төрлийг Rectangle-аас Shape болгосон, илүү сайн abstraction
        Shape shape = new Rectangle(2, 3);
        Renderer renderer = new Renderer(shape);
        renderer.draw();
    }
}
