package backtracking;

/**
 *
 * @author Marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]){
    
    BackTracking BT = new BackTracking();
    UI ui = new UI(BT);
    BT.setUI(ui);
    
	int[][] board = new int[][] 
	{ 
            {6, 0, 7,  5, 0, 0,  1, 0, 0},
            {0, 0, 1,  9, 0, 0,  0, 0, 0},
            {0, 0, 0,  0, 0, 0,  6, 0, 5},
            
            {1, 0, 5,  0, 0, 0,  0, 0, 0},
            {0, 0, 0,  0, 4, 5,  0, 8, 0},
            {0, 0, 0,  0, 8, 0,  0, 2, 7},
            
            {0, 0, 0,  0, 0, 6,  3, 0, 0},
            {0, 2, 0,  0, 0, 0,  7, 1, 8},
            {0, 9, 0,  0, 0, 4,  0, 0, 0}
	}; 
	int N = board.length; 
        
        BT.n = N;
        BT.board = board;

    ui.setVisible(true);
} 
} 
    

