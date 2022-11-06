package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.Cleveland;

public class SuperCleveland extends Cleveland {
    public SuperCleveland(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Cleveland' падает с дополнительными клетками " + this.getCells());
    }

}
