package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.Hero;
import kg.charginov.tetris.model.Shape;
import kg.charginov.tetris.model.service.PercentRandom;

public class HeroFactory implements ShapeFactory{
    final int cells = 6;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new Hero(cells);
        }
        return new Hero(cells);
    }
}
