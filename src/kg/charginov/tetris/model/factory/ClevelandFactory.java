package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.*;
import kg.charginov.tetris.model.service.PercentRandom;
import kg.charginov.tetris.supermodel.SuperCleveland;

public class ClevelandFactory implements ShapeFactory{
    final int cells = 8;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new Cleveland(cells);
        }
        return new SuperCleveland(cells);
    }
}
