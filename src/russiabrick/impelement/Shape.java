package russiabrick.impelement;

import russiabrick.base.AbstractShape;
import russiabrick.base.Block;

import java.util.List;

/**
 * Created by i320031 on 3/8/2017.
 */
public class Shape extends AbstractShape {
    public Shape(int[][] blocksPos) {
        this.onInit(blocksPos);
    }

    @Override
    public void onInit(int[][] blocksPos){
        int counter = 0;
        for(int i = 0; i < blocksPos.length; i++) {
            if(blocksPos[i].length == 2) {
                allBlocks.add(new Block(blocksPos[i][0], blocksPos[i][1]));
                counter++;
            }
            if(counter == 4) {
                break;
            }
        }
        //TODO: need to refator
        leftBorder.add(allBlocks.get(0));
        leftBorder.add(allBlocks.get(1));
        rightBorder.add(allBlocks.get(0));
        rightBorder.add(allBlocks.get(3));
        bottomBorder.add(allBlocks.get(0));
        bottomBorder.add(allBlocks.get(2));
        bottomBorder.add(allBlocks.get(3));
    }

    @Override
    public void rotate(){

    }

    @Override
    public List<Block> getLeftBorder(){
        return leftBorder;
    }

    @Override
    public List<Block> getRightBorder(){
        return rightBorder;
    }

    @Override
    public List<Block> getBottomBorder(){
        return bottomBorder;
    }
}
