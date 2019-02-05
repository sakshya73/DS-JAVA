public class BlackShapes {
    
     // Static variable
    
    public void findSize(ArrayList<String> A, int i, int j, int row, int col, boolean visited[][])
    {  
        
        int dir[][] = {
                          {-1, 0},
                          {0, 1},
                          {1, 0},
                          {0, -1}
            
        };   //directions : left, up, right, down
        visited[i][j] = true;
        for(int k = 0; k < 4; k++)
        {
            int newi = i + dir[k][0];
            int newj = j + dir[k][1];
            
            if(newi >= 0 && newi < row && newj >= 0 && newj < col && visited[newi][newj] == false && A.get(newi).charAt(newj) == 'X')
            {
                findSize(A, newi, newj, row, col, visited);
            }
        }
    }
    public int black(ArrayList<String> A) {
        int i, j, row, col, result = 0;
        row = A.size();
        col = A.get(0).length();
        boolean visited[][] = new boolean[row][col];
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                if(visited[i][j] == false && A.get(i).charAt(j) == 'X')
                {
                    result++;
                    findSize(A, i, j, row, col, visited);
                
                }
            }
        }
        return result;
    }
}