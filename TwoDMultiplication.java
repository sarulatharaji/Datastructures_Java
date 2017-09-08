package ArrayConcepts;
import java.util.*;
public class TwoDMultiplication {
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
					System.out.println("Multiplication of arrays");
					int sum[][]=new int[n][n];
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							sum[i][j]=0;
							for(int k=0;k<n;k++)
							{
							sum[i][j]+=arr[i][k]*arr1[k][j];
							}
						}
					}
					
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							System.out.print(sum[i][j]+" ");
						}
						System.out.println();
					}
		}
}
