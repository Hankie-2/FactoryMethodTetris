package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.*;
import kg.charginov.tetris.model.service.PercentRandom;
import kg.charginov.tetris.supermodel.SuperTeewee;

public class TeeweeFactory implements ShapeFactory{
    final int cells = 4;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new Teewee(cells);
        }
        return new SuperTeewee(cells);
    }
}
