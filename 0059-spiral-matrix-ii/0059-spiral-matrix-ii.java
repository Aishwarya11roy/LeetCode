class Solution {
    public int[][] generateMatrix(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=n*n;i++){
            list.add(i);
        }
        int [][] matrix = new int[n][n];
        int [] rd = {0,1,0,-1};
        int [] cd = {1,0,-1,0};
        boolean [][] visited = new boolean[n][n];
        int di = 0;
        int x = 0;
        int y = 0;

        for(int i = 0;i< n* n ; i++){
            matrix[x][y] = list.get(i);
            visited[x][y] = true;
            int cr = x + rd[di];
            int cc = y + cd[di];

            if(0 <= cr && cr < n && 0 <= cc && cc < n && !visited[cr][cc]){
                x = cr;
                y = cc;
            }
            else{
                di = (di + 1) % 4;
                x += rd[di];
                y += cd[di];
            }

        }
         return matrix;
        
    }
}