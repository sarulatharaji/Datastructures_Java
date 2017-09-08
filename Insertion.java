package ArrayConcepts;

import java.util.*;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>(n);
		//Inserting elements in list
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
			System.out.println(list);
		}
		list.add(4, 15);
		System.out.println(list);
		//removing element from list
		list.remove(2);
		System.out.println(list);
		sc.close();
	}

}
