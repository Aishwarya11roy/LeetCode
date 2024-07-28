class Solution {
public List<Integer> spiralOrder(int[][] matrix) {
    // Get the dimensions of the matrix
    int m = matrix.length;
    int n = matrix[0].length;
    
    // Direction arrays define the movement in spiral: right, down, left, up
    int [] rowdir = {0, 1, 0, -1};
    int [] coldir = {1, 0, -1, 0};
    
    // Starting point of the spiral
    int x = 0, y = 0;
    
    // Current direction index
    int dir = 0;
    
    // Visited array to keep track of already visited elements
    boolean [][] visited = new boolean[m][n];
    
    // Result list to store the spiral order
    List<Integer> result = new ArrayList<>();
    
    // Current row and column, initialized to start
    int currcol = 0;
    int currrow = 0;

    // Iterate over all elements in the matrix
    for(int i = 0; i < m * n; i++) {
        // Add the current element to the result
        result.add(matrix[x][y]);
        
        // Mark the current position as visited
        visited[x][y] = true;
        
        // Compute the next row and column based on current direction
        currrow = x + rowdir[dir];
        currcol = y + coldir[dir];
        
        // Check if the next position is within bounds and not visited
        if(0 <= currrow && currrow < m && 0 <= currcol && currcol < n && !visited[currrow][currcol]) {
            // Move to the next position
            x = currrow;
            y = currcol;
        } else {
            // Change direction (right -> down -> left -> up)
            dir = (dir + 1) % 4;
            x += rowdir[dir];
            y += coldir[dir];
        }
    }
   return result;
}
}
/**
Intuition Behind the Code
Movement Direction Control: The direction arrays (rowdir and coldir) cleverly control the movement direction. The direction index (dir) is used to cycle through these directions in a fixed sequence to achieve the spiral motion.
Boundary and Visitation Checks: The main loop checks if the next step in the current direction is valid — that is, within the matrix boundaries and not previously visited. If the next step is invalid, the direction is changed.
Loop until all elements are visited: The loop continues until all elements of the matrix (m * n elements) are added to the result list.
Complexity
Time Complexity: O(m*n) since every element is processed exactly once.
Space Complexity: O(mn) due to the space needed for the visited array, plus O(min(m, n)) for the result list storage. However, since the result storage is required for the output, we might consider the auxiliary space usage as O(mn) mainly because of the visited array. */