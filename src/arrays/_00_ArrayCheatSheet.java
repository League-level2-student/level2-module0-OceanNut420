package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] arr = {"a","b","c","d","e"};
		
		//2. print the third element in the array
		//System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "f";
		//4. print the third element again
		//System.out.println(arr[2]);
		arr[2] = "c";
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] ar = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		//7. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i = 0;i < 50; i++) {
			ar[i] = rand.nextInt();
		}
		//8. without printing the entire array, print only the smallest number in the array
		int augh = ar[0];
		for(int i=0;i<50;i++) {
			int waa = ar[i];
			if(waa < augh) {
				augh = waa;
			}
		}
		System.out.println(augh);
		//9 print the entire array to see if step 8 was correct
		//maybe tmrw
		//10. print the largest number in the array.
		
		int augh2 = ar[0];
		for(int i=0;i<50;i++) {
			int waa2 = ar[i];
			if(waa2 > augh2) {
				augh2 = waa2;
			}
		}
		
		System.out.println(augh2);
		
	}
}
