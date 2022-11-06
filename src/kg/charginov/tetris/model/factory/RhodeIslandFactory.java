package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.*;
import kg.charginov.tetris.model.service.PercentRandom;
import kg.charginov.tetris.supermodel.SuperRhodeIsland;

public class RhodeIslandFactory implements ShapeFactory{
    final int cells = 5;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new RhodeIsland(cells);
        }
        return new SuperRhodeIsland(cells);
    }
}
