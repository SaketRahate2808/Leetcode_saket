Problem no.48 : Rotate Image 
Problem description:
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Solution:

Intuition: By observation, we observe that the first column of the original matrix is the reverse of the first row of the rotated matrix, so we transpose the matrix and then reverse each row, and because we are making modifications to the matrix itself, space complexity is reduced to O(1).

Step 1 of my approach is to transpose the matrix. (Transposing involves converting columns to rows and rows to columns).

Step 2: Reverse the rows of the matrix.

code:

class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length;i++){
            for(int j=i; j<matrix[0].length;j++){
                int temp=0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j <matrix.length/2;j++){
               int temp=0;
               temp = matrix[i][j];
               matrix[i][j] = matrix[i][matrix.length-1-j]; 
               matrix[i][matrix.length-1-j]=temp;
            }
        }
    }
}
