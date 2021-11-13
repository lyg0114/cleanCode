import java.util.ArrayList;
import java.util.List;

public class ch2 {

    final int STATUS_VALUE = 0;
    final int FLAGGED = 4;

    public static void main(String[] args) {

    }

   // V1
   public List<int[]> getFlaggedCells(){

       List<int[]> flaggedCells = new ArrayList<int[]>();
       List<int[]> gameBoard = new ArrayList<int[]>();

       for(int[] cell : gameBoard)
           if(cell[STATUS_VALUE] == FLAGGED)
               flaggedCells.add(cell);
       return flaggedCells;
   }
    // V2
    public List<Cell> getFlaggedCells2(){

        List<Cell> flaggedCells = new ArrayList<Cell>();
        List<Cell> gameBoard = new ArrayList<Cell>();

        for(Cell cell : gameBoard)
            if(cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;

    }


}

class Cell {

    final int STATUS_VALUE = 0;
    final int FLAGGED = 4;

    int[] cell = new int[100];

    boolean isFlagged(){
        if(this.cell[STATUS_VALUE] == FLAGGED)
            return true;
        else
            return false;
    }


}







