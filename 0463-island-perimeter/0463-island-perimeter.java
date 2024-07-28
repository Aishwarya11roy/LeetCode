class Solution {
    public int islandPerimeter(int[][] grid) {

        boolean [][]visited = new boolean[grid.length][grid[0].length];
        for(int row =0;row<grid.length;row++){
            for(int col = 0;col<grid[0].length;col++){
                if(grid[row][col] == 1){
                    return getPerimeterDFS(grid, visited, row, col);  
                }
            }
        }
        return 0; // if only water is there
    }
    private int getPerimeterDFS(int[][] grid, boolean [][] visited, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length){
            return 1;
        }
         // Check if the cell is water and return 1. No need to do a DFS
         if (grid[row][col] == 0) {
            return 1;
        }
        if(visited[row][col]){
            return 0;
        }
        visited[row][col] = true;

        int count = getPerimeterDFS(grid, visited, row+1 , col) +
        getPerimeterDFS(grid, visited,row - 1,col) +
        getPerimeterDFS(grid, visited , row, col + 1) +
        getPerimeterDFS(grid , visited, row, col - 1);

        return count;


    }
}
