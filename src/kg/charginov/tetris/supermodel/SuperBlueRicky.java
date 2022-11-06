package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.BlueRicky;

public class SuperBlueRicky extends BlueRicky {
    public SuperBlueRicky(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Blue Ricky' падает с дополнительными клетками " + this.getCells());
    }
}
