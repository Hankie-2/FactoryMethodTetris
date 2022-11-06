package kg.charginov.tetris.model;

public class OrangeRicky extends Figure implements Shape{
    public OrangeRicky(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Orange Ricky' падает с " + this.getCells() + " клетками");
    }
}
