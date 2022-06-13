package Flood_Fill;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {



        //if(...){ burdaki ifin içine en kenarlarda ve köşelerde değilse diye yaz
        // bunun için sc length -1 den küçük olmalı mesela
            if(image [sr][sc] == image [sr-1][sc]){
                image [sr-1][sc] = newColor;
                Find(image, sr-1, sc, newColor);

                // boyq
                // ve bul (bu da eşitse boya)
            }
            if(image [sr][sc] == image [sr+1][sc]){
                image [sr+1][sc] = newColor;
                Find(image, sr+1, sc, newColor);
            }
            if(image [sr][sc] == image [sr][sc-1]){
                image [sr][sc-1] = newColor;
                Find(image, sr, sc-1, newColor);
            }
            if(image [sr][sc] == image [sr][sc+1]){
                image [sr][sc+1] = newColor;
                Find(image, sr, sc+1, newColor);
            }

        return image;
    }
    void Find(int[][] image_, int sr_, int sc_, int newColor_){
        if(image_ [sr_][sc_] == image_ [sr_-1][sc_]){
            image_ [sr_-1][sc_] = newColor_;
        }
        if(image_ [sr_][sc_] == image_ [sr_+1][sc_]){
            image_ [sr_+1][sc_] = newColor_;
        }
        if(image_ [sr_][sc_] == image_ [sr_][sc_-1]){
            image_ [sr_][sc_-1] = newColor_;
        }
        if(image_ [sr_][sc_] == image_ [sr_][sc_+1]){
            image_ [sr_][sc_+1] = newColor_;
        }
    }
}
