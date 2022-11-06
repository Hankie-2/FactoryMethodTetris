package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.OrangeRicky;

public class SuperOrangeRicky extends OrangeRicky {
    public SuperOrangeRicky(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Orange Ricky' падает с дополнительными клетками " + this.getCells());
    }

}
