package kg.charginov.tetris.model;

public class Cleveland extends Figure implements Shape{

    public Cleveland(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Cleveland' падает с " + this.getCells() + " клетками");
    }
}
