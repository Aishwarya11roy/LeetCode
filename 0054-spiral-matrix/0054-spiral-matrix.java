class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [] rowdir = {0,1,0,-1};
        int [] coldir = {1,0,-1,0};
        int x = 0;
        int y = 0;
        int dir = 0;
        boolean [][] visited = new boolean[m][n];
        List<Integer> result = new ArrayList<>();
        int currcol = 0;
        int currrow = 0;

        for(int i = 0;i<m *n ;i++){
            result.add(matrix[x][y]);
            visited[x][y] = true;
            currrow = x + rowdir[dir];
            currcol = y + coldir[dir];
            if(0 <= currrow && currrow < m && 0<= currcol && currcol <n &&     !visited[currrow][currcol]){
                x = currrow;
                y = currcol;
            }
            else{
                dir = (dir + 1) % 4;
                x += rowdir[dir];
                y += coldir[dir];
            }
        }
       return result;
    }
}