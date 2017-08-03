package russiabrick.util;

import russiabrick.GameBoard;
import russiabrick.base.Block;
import russiabrick.interfaces.IShape;

import java.util.Map;

/**
 * Created by i320031 on 3/8/2017.
 */
public class BorderManager {
    private GameBoard gameBoard;
    private Map<Block, Integer> blocksStatusMap;
    private IShape currentShape;

    public BorderManager(GameBoard gameBoard) {
        this.gameBoard = gameBoard;
    }

    public boolean isLeftMovable() {
        for (Block block : currentShape.getLeftBorder()) {
            Integer leftBlockState = blocksStatusMap.get(new Block(block.getRow(), block.getColumn() - 1));
            if (block.getColumn() == 0 || leftBlockState == null || leftBlockState == 1)
                return false;
        }
        return true;
    }

    public boolean isRightMovable() {
        for (Block block : currentShape.getRightBorder()) {
            Integer rightBlockState = blocksStatusMap.get(new Block(block.getRow(), block.getColumn() + 1));
            if (block.getColumn() == 0 || rightBlockState == null || rightBlockState == 1)
                return false;
        }
        return true;
    }

    public boolean isBottomMovable() {
        for (Block block : currentShape.getBottomBorder()) {
            Integer bottomBlockState = blocksStatusMap.get(new Block(block.getRow() + 1, block.getColumn()));
            if (block.getColumn() == 0 || bottomBlockState == null || bottomBlockState == 1)
                return false;
        }
        return true;
    }
}
