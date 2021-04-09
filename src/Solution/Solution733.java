package Solution;

import java.util.*;

public class Solution733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Queue<int[]> queue = new LinkedList<int[]>(  );
        queue.add(new int[]{sr, sc});
        int oldColor = image[sr][sc];
        if(oldColor == newColor) return image;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int row = cur[0];
            int col = cur[1];
            if(row - 1 >= 0 && image[row - 1][col] == oldColor) queue.add(new int[]{row - 1,col});
            if(row + 1 < image.length && image[row + 1][col] == oldColor) queue.add(new int[]{row + 1,col});
            if(col - 1 >= 0 && image[row][col - 1] == oldColor) queue.add(new int[]{row,col - 1});
            if(col + 1 < image[0].length && image[row][col + 1] == oldColor) queue.add(new int[]{row,col + 1});
            image[row][col] = newColor;
        }
        return image;
    }
}
