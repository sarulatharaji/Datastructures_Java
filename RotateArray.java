package ArrayConcepts;
import java.util.*;
public class RotateArray {
	static int[] rotateArray(int arr[],int pos,int size)
	{
		int rev[]=new int[size];
		int temp=0;
		for(int i=0;i<pos;i++)
		{
			int j;
			temp=arr[0];
			for(j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		rev=Arrays.copyOf(arr,arr.length);
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		System.out.println("Enter the positions to rotate:");
		int pos=sc.nextInt();
		int[] arr=new int[size];
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		list.add(arr[i]);
		}
		System.out.println(list);
		int []sum=rotateArray(arr,pos,size);
		for(int i=0;i<size;i++)
		{
		System.out.println(sum[i]);
		}
	}

}
