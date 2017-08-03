package russiabrick.base;

/**
 * Created by i320031 on 3/8/2017.
 */
public class Block {
    private int row;
    private int column;

    public Block(int row, int column){
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
