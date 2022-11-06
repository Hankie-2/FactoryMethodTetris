package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.Hero;

public class SuperHero extends Hero {
    public SuperHero(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Hero' падает с дополнительными клетками " + this.getCells());
    }

}
