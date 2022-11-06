package kg.charginov.tetris;

import kg.charginov.tetris.model.Shape;
import kg.charginov.tetris.model.factory.ShapeFactory;
import kg.charginov.tetris.model.service.ShapeFactoryService;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactoryService.createShapeFactory();
        Shape shape = factory.createShape();

        shape.fall();
    }
}
