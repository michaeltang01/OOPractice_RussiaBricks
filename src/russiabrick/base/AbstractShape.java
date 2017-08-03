package russiabrick.base;

import russiabrick.interfaces.IShape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i320031 on 3/8/2017.
 */
public abstract class AbstractShape implements IShape {
    //for border of a shape
    protected List<Block> leftBorder = new ArrayList<>();
    protected List<Block> rightBorder = new ArrayList<>();
    protected List<Block> bottomBorder = new ArrayList<>();

    protected List<Block> allBlocks;

    @Override
    public List<Block> getAllBlocks() {
        return allBlocks;
    }

    @Override
    public void leftMove() {
        for (Block block : allBlocks) {
            block.setColumn(block.getColumn() - 1);
        }
    }

    @Override
    public void rightMove() {
        for (Block block : allBlocks) {
            block.setColumn(block.getColumn() + 1);
        }
    }

    @Override
    public void downMove() {
        for (Block block : allBlocks) {
            block.setRow(block.getRow() + 1);
        }
    }
}
