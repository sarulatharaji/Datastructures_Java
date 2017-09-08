package ArrayConcepts;
import java.util.*;
public class TwoDAddition {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				int []arr[]=new int[n][n];
				System.out.println("Enter first array");
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						arr[i][j]=sc.nextInt();
					}
				}
				System.out.println("Enter second array");
				int [][]arr1=new int[n][n];
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						arr1[i][j]=sc.nextInt();
					}
				}
				System.out.println("Sum of arrays");
				int sum[][]=new int[n][n];
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						sum[i][j]=arr[i][j]+arr1[i][j];
					}
				}
				
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						System.out.print(sum[i][j]);
					}
					System.out.println();
				}
			}
	}
