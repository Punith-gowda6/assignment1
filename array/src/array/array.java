package array;

public class array {

	public static void main(String[] args) {
		int[][] arr1= {{10,12,13,14},{20,21,22,23}};
		int[][] arr2= {{10,12,13,14},{20,21,22,23}};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
	}

}
