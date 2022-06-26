package xyz;

public class IslandPerimeter {
	
	public static int islandPerimeter(int [][]grid) {
		
		int res=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1) {
					res+=4;
					
					if(i>0 && grid[i-1][j]==1) {
						res-=2;
					}
					
					if(j>0 && grid[i][j-1]==1) {
						res-=2;
					}
				}
			}
		}
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {

		int [][]grid = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		islandPerimeter(grid);
	}

}
