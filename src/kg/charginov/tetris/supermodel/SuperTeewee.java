package kg.charginov.tetris.supermodel;

import kg.charginov.tetris.model.Teewee;

public class SuperTeewee extends Teewee {
    public SuperTeewee(int cells) {
        super(cells*2);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Teewee' падает с дополнительными клетками " + this.getCells());
    }

}
