package kg.charginov.tetris.model;

public class RhodeIsland extends Figure implements Shape{
    public RhodeIsland(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Rhode Island' падает с " + this.getCells() + " клетками");
    }
}
