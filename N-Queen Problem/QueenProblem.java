package pkg8.queen.problem;
import java.util.*;

/*
 * @author Gaurav
 */
public class QueenProblem {
    
    private static int N;
    private LinkedList<Integer> arr = new LinkedList<>();
    
    
    // ---------------- isSafe () --------------------------------------
    public boolean isSafe(int mat[][],int r, int c){
        for(int i=0;i<N;i++){
            if(mat[r][i] == 1) return false;
            if(mat[i][c] == 1) return false;
        }
        for (int i = r,j = c;i >= 0 && j >= 0;i--,j--) {
		if (mat[i][j] == 1)
			return false;
		}
        for (int i = r,j = c;i<N && j>=0;i++,j--) {
		if (mat[i][j] == 1)
			return false;
		}
        return true;
    
    }
    
     // ---------------- solveNQProblem () --------------------------------------
   public boolean solveNQProblem(int mar[][], int n){   
        if(n>=N)
            return true;
        for(int i=0;i<N;i++){
            if(isSafe(mar,i,n)){
                mar[i][n] = 1;
                if(solveNQProblem(mar,n+1))
                    return true;
                mar[i][n] = 0;
            }
        }
        return false;
    }
     
      void printSolution(int board[][])
    {  
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++)
			if (board[i][j] == 1) {
                            arr.add(j+1);
				System.out.print("Q ");
			} else {
				System.out.print("_ ");
			}
		System.out.println("\n");
		}
        for (int i = 0; i < N; i++){
            System.out.println("row: "+(i+1)+"| Column: "+arr.get(i));
        
        }
        
    }
	
   // ----------------------------- main () ---------------------------------------	
    public static void main(String[] args) {
        QueenProblem Q = new QueenProblem();
        Scanner scan = new Scanner(System.in);
	System.out.println("State the value of N in this program!");
	N = scan.nextInt();
	int[][] board = new int[N][N];
	if (!Q.solveNQProblem(board, 0)) {
		System.out.println("Solution not found.");
                System.exit(0);
	}
	Q.printSolution(board);
       
    }
    
}
