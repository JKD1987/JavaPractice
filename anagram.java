import java.util.*;
class anagram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		String string1 = sc.nextLine();
		System.out.println("Enter the second String: ");
		String string2 = sc.nextLine();
		if(string1.length() != string2.length())
			System.out.println("The entered Strings aren't anagrams.");
		else{
			int value = 0;
			for(int i=0; i<string1.length(); i++){
				value = value ^ string1.charAt(i);
				value = value ^ string2.charAt(i);
			}
			if(value==0)
				System.out.println("The entered Strings are anagrams.");
			else System.out.println("The entered Strings aren't anagrams.");
		}
	}
}