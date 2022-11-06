package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.*;
import kg.charginov.tetris.model.service.PercentRandom;
import kg.charginov.tetris.supermodel.SuperSmashBoy;

public class SmashBoyFactory implements ShapeFactory{
    final int cells = 9;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new SmashBoy(cells);
        }
        return new SuperSmashBoy(cells);
    }
}
