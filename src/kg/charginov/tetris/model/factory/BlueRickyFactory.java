package kg.charginov.tetris.model.factory;

import kg.charginov.tetris.model.BlueRicky;
import kg.charginov.tetris.model.Shape;
import kg.charginov.tetris.supermodel.SuperBlueRicky;
import kg.charginov.tetris.model.service.PercentRandom;

public class BlueRickyFactory implements ShapeFactory{
    final int cells = 5;
    @Override
    public Shape createShape() {
        int percent = PercentRandom.getRandomPercent();
        if(percent <= 80){
            return new BlueRicky(cells);
        }
        return new SuperBlueRicky(cells);
    }
}
