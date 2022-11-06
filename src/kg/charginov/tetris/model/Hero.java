package kg.charginov.tetris.model;

public class Hero extends Figure implements Shape{
    public Hero(int cells) {
        super(cells);
    }

    @Override
    public void fall() {
        System.out.println("Фигура 'Hero' падает с " + this.getCells() + " клетками");
    }
}
