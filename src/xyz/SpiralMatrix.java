package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {
	
	public static List<Integer> spiralOrder(int [][]matrix) {
		
		List<Integer> ans = new ArrayList<Integer>();
		if(matrix.length==0) {
			return ans;
		}
		
		int startRow=0;
		int endRow=matrix.length-1;
		int startColumn=0;
		int endColumn=matrix[0].length-1;
		
		while(startRow<=endRow && startColumn<=endColumn) {
			
			for(int j=startColumn;j<=endColumn;j++) {
				ans.add(matrix[startRow][j]);
			}
			startRow++;
		
		
		for(int i=startRow;i<=endRow;i++) {
			ans.add(matrix[i][endColumn]);
		}
		endColumn--;
		
		if(startRow<=endRow) {
		for(int j=endColumn;j>=startColumn;j--) {
			ans.add(matrix[endRow][j]);
		}
		}
		endRow--;
		
		if(startColumn<=endColumn) {
		for(int i=endRow;i>=startRow;i--) {
			ans.add(matrix[i][startColumn]);
		}
		}
		startColumn++;
		}
		
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		
		int [][]matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		spiralOrder(matrix);
	}

}
