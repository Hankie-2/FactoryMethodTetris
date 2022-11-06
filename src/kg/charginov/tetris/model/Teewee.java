package kg.charginov.tetris.model;

public class Teewee extends Figure implements Shape{

    public Teewee(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Teewee' падает с " + this.getCells() + " клетками");
    }
}
