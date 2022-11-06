package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.OrangeRicky;
import kg.charginov.tetris.model.Shape;
import kg.charginov.tetris.supermodel.SuperBlueRicky;
import kg.charginov.tetris.model.service.PercentRandom;

public class OrangeRickyFactory implements ShapeFactory{
    final int cells = 7;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new OrangeRicky(cells);
        }
        return new SuperBlueRicky(cells);
    }
}
