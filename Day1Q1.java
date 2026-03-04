// 1582. Special Positions in a Binary Matrix
// Given an m x n binary matrix mat, return the number of special positions in mat.
// 
// // A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed). 
import java.util.Scanner;

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (mat[i][j] == 1) {

                    boolean flag = true;

                    // Check row
                    for (int col = 0; col < n; col++) {
                        if (col != j && mat[i][col] == 1) {
                            flag = false;
                            break;
                        }
                    }

                    // Check column
                    for (int row = 0; row < m; row++) {
                        if (row != i && mat[row][j] == 1) {
                            flag = false;
                            break;
                        }
                    }

                    if (flag) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}

public class Day1Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        System.out.println("Enter matrix elements (0 or 1):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        Solution obj = new Solution();
        int result = obj.numSpecial(mat);

        System.out.println("Number of Special Positions: " + result);

        sc.close();
    }
}