import java.util.*;

class bitsToBeFlipped{
	
	static int countSetBits(int n){
		int count = 0;
		while(n>0){
			n= n&(n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		int val = num1^num2;
		int countSetBits = bitsToBeFlipped.countSetBits(val);
		System.out.println("Number of bits to be flipped to convert first number into second is: " + countSetBits);
	}
}