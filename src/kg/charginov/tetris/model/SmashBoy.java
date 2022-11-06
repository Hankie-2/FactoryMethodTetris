package kg.charginov.tetris.model;

public class SmashBoy extends Figure implements Shape{
    public SmashBoy(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'SmashBoy' падает с " + this.getCells() + " клетками");
    }
}
