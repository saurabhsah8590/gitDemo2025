package TestPackage;

public class ArraysTest {

	public static void main(String[] args) {
		
		/*
		 int a[] = new int[5];
		 
		a[0] = 5;
		a[1] = 12;
		a[2] = 55;
		a[3] = 9;
		a[4] = 11;

		for(int i=0; i<a.length;i++)
			System.out.println(a[i]);
			*/
		
		int a[][] = new int[2][3];
		a[0][0] = 5;
		a[0][1] = 3;
		a[0][2] = 9;
		a[1][0] = 2;
		a[1][1] = 4;
		a[1][2] = 8;
		
		for(int i = 0;i < 2; i++)
		{
			for(int j = 0;j < 3; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}

}
