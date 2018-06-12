/*Write a program to take an array of 10 numbers from the user and arrange the elements in a waveform. 
For example, if the array is {1,2,3,4,5,6,7,8,9,10} then it should become {2,1,4,3,6,5,8,7,10,9}.*/

package Assignment5;
import java.util.Scanner;
public class WaveformArray {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String ar[])
	{
		int num,temp,swap;
        int[] arr = new int[10];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int i=0;i<10;i++)
		{
			num=obj.nextInt();
			arr[i]=num;
		}
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array after sorting is :");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
		int j;
		for(int i=0;i<10;i=i+2)
		{
			    j=i+1;
				swap=arr[i];
				arr[i]=arr[j];
				arr[j]=swap;
		}
		System.out.println("\nArray after waveform is :");
		for(int i=0;i<10;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
