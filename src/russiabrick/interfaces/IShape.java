package russiabrick.interfaces;

import russiabrick.base.Block;

import java.util.List;

/**
 * Created by i320031 on 3/8/2017.
 */
public interface IShape {
    public void onInit(int[][] blocksPos);
    public void leftMove();
    public void rightMove();
    public void downMove();
    public void rotate();

    public List<Block> getAllBlocks();
    public List<Block> getLeftBorder();
    public List<Block> getRightBorder();
    public List<Block> getBottomBorder();
}
