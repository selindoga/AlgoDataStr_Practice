package Flood_Fill;
// 733. Flood Fill
public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int colorToBeChanged = image[sr][sc];
        if (colorToBeChanged != newColor){
            ChangeColor(image, sr, sc, colorToBeChanged,newColor);
        }
        return image;
    }
    void ChangeColor(int[][] image, int sr, int sc, int colorToBeChanged, int newColor){
        if(image[sr][sc] == colorToBeChanged){
            image[sr][sc] = newColor;
            if(sr >= 1)
                ChangeColor(image, sr-1, sc, colorToBeChanged, newColor);
            if(sc >= 1)
                ChangeColor(image, sr, sc-1, colorToBeChanged, newColor);
            if(sr+1 < image.length)
                ChangeColor(image, sr+1, sc, colorToBeChanged, newColor);
            if (sc+1 < image[0].length)
                ChangeColor(image, sr, sc+1, colorToBeChanged, newColor);
        }
    }
}
