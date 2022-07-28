public class islandProblem {
    public static void main(String[] args) {


    }

    public int numOfIsland(char grid[][]){
        int islandCount=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ++islandCount;
                    changeOneToZero(grid,i,j);
                }
            }
        }

        return islandCount;
    }

    private void changeOneToZero(char[][] grid, int i, int j) {
        if(i<0 || i>grid.length || j<0 || j>grid[0].length || grid[i][j]=='0' ) return;
        grid[i][j]='0';
        changeOneToZero(grid,i+1,j);
        changeOneToZero(grid,i-1,j);
        changeOneToZero(grid,i,j+1);
        changeOneToZero(grid,i,j-1);

    }
}
