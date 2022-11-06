package kg.charginov.tetris.model;

public class BlueRicky extends Figure implements Shape{
    public BlueRicky(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Blue Ricky' падает с " + this.getCells() + " клетками");
    }
}