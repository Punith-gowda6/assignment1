package array;

public class array2 {

	public static void main(String[] args) {
		int[][] arr1= {{10,12,13,14},{20,21,22,23}};
		int[][] arr2= {{10,12,13,14},{20,21,22,23}};
		int[][] arr=new int[2][4];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr[i][j]= arr1[i][j] + arr2[i][j] ;
			}
		}
		System.out.println("1st");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("2nd");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("result___");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}

}
