package kg.charginov.tetris.model;

public abstract class Figure {
    private int cells;

    public Figure(int cells) {
        this.cells = cells;
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }
}
