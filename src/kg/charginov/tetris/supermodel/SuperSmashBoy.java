package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.SmashBoy;

public class SuperSmashBoy extends SmashBoy {
    public SuperSmashBoy(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Smash Boy' падает с дополнительными клетками " + this.getCells());
    }

}
