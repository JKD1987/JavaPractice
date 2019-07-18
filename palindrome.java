import java.util.Scanner;

class palindrome{
	public static void main(String[] args){
		int palFlag = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of your choice: ");
		String st = sc.nextLine();
		int i=0;
		int j=st.length()-1;
		while(i<=j){
			if(st.charAt(i)!=st.charAt(j)){
				System.out.println("Entered String is not a Palindrome.");
				palFlag = 0;
				break;
			}else{
				i++;
				j--;
			}
		}
		if(palFlag == 1)
			System.out.println("The entered String is a Palindrome.");	
	}
}