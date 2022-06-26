package xyz;

import java.util.Arrays;

public class MatrixReshape {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		
		int rows = nums.length;
		int columns = nums[0].length;
		
		if((rows*columns) != (r*c))
			return nums;
		
		int[][] output_arr = new int[r][c];
		int row_num=0;
		int column_num=0;
		
		for(int i=0;i<rows; i++) {
			for(int j=0;j<columns;j++) {
				output_arr[row_num][column_num] = nums[i][j];
				column_num++;
				if(column_num==c) {
					column_num=0;
					row_num++;
				}
			}
		}
		for(int i=0;i<output_arr.length;i++) {
			for(int j=0;j<output_arr[i].length;j++) {
				System.out.print(output_arr[i][j] + " ");
			}
			System.out.println();
		}
		return output_arr;

	}
	
	public static void main(String[] args) {
		int[][] mat = {{1,2},{3,4}};
		int r=1;
		int c=4;
		matrixReshape(mat, r, c);
	}

}
