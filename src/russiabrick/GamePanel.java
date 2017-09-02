package russiabrick;

import russiabrick.impelement.Shape;

public class GamePanel {
	private Shape currentShape;
	private int blockStatusMap[][]; // 1 means this block is empty
	
    public void onInit(int width, int height){
        // use the para to draw the initial panel
        
    	return;
    }
    
    public Shape getCurrentShape() {
    	return this.currentShape;
    } 
    
    public void dockShape() {
    	// TODO: is this correct?
    	this.currentShape.rotate();
    	return;
    }
    
    public void removeShapeBg() {
    	// TODO: render the background with JavaFX, clean all
    }
    
    public void renderShapeBg() {
    	// TODO: render the background with JavaFX
    }
    
    public void removeFullRow() {
    	for (int rowCnt = 0; rowCnt < this.blockStatusMap.length; rowCnt++) {
    		if (this.isRowRemovable(rowCnt) == true) {
    			// Remove the row
    			this.renderShapeBg();
    		}
    	}
    }
    
    public boolean isRowRemovable(int rowNum) {
    	int colNum = 0;

		while (colNum < this.blockStatusMap[0].length) {
			if (this.blockStatusMap[rowNum][colNum] == 1) {
				return false;
			}
			colNum++;
		}
    	return true;
    }
    
    public void setGamePanelGridBlock() {
    	return;
    }
    
    public void setShapeBg() {
    	return;
    }
    
    public void setBlockStatus() {
    	return;
    }
    
    public void setRowStatus() {
    	return;
    }
    
    public void setBlockBg() {
    	return;
    }
}
