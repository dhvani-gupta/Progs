import java.lang.*;
import java.util.*;
class Bubblesort_prog
{

public static void bubbleSort(int[] arr , int n) 
{   
        int temp = 0;  
         for(int i=0; i < n; i++)
        {  
                 for(int j=1; j < (n-i); j++)
	{  
                          if(arr[j-1] > arr[j])
		{  
                                             temp = arr[j-1];  
                                 	      arr[j-1] = arr[j];  
                                            arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args)
 {  
	Scanner ob = new Scanner(System.in);
	int arr[] = new int[100] ;
	int n;
	System.out.println(" Enter array size; ");
	n = ob.nextInt();
	System.out.println(" Enter elements ");
                   for(int i=0;i<n;i++)
	{
		arr[i] = ob.nextInt();
	}
                  System.out.println("Array Before Bubble Sort");  
                  for(int i=0; i < n; i++)
	{  
                        System.out.println(arr[i] + " ");  
                    }  
                   bubbleSort(arr,n);//sorting array elements using bubble sort  
                   System.out.println("Array After Bubble Sort");  
                    for(int i=0; i < n; i++)
	{  
                    	System.out.println(arr[i] + " ");  
                  }  
           }  
}  