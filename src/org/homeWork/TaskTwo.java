package org.homeWork;

public class TaskTwo {
    public static void main(String[] args) {
        int[][] image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;

        // Вывод в консоль входного массива
        for (int[] ints : image) {
            for (int anInt : ints)
                System.out.print(anInt);
            System.out.print("\n");
        }
        System.out.println("=========");
        floodFill(image, sr, sc, color);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]) {
            return image;
        }

        recColorFunc(image, sr, sc, image[sr][sc], color);
        // Вывод в консоль массива на выходе
        for (int[] ints : image) {
            for (int anInt : ints)
                System.out.print(anInt);
            System.out.print("\n");
        }

        return image;
    }

    public static void recColorFunc(int[][] image, int i, int j, int oldColor, int color) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != oldColor) {
            return;
        }
        image[i][j] = color;
        recColorFunc(image, i - 1, j, oldColor, color);
        recColorFunc(image, i + 1, j, oldColor, color);
        recColorFunc(image, i, j - 1, oldColor, color);
        recColorFunc(image, i, j + 1, oldColor, color);
    }
}
