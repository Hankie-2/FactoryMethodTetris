package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.RhodeIsland;

public class SuperRhodeIsland extends RhodeIsland {
    public SuperRhodeIsland(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Rhode Island' падает с дополнительными клетками " + this.getCells());
    }

}
