package fathima;

import java.util.Arrays;

public class sortarray {
	public static void main(String [] args) {
		String names[]= {"fara","rinsha","hamna","sreelaya","manya","gopika","jeslin"};
		int size=names.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
	}

}