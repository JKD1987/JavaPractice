import java.util.*;

class rotateBits{
	static final int NO_OF_BITS =4;
	
	static int performShift(int n, int bits, String direction){
		if(direction == "LEFT" || direction == "Left" || direction == "left"){
			int x = ((n<<bits)|(n>>(NO_OF_BITS-bits)));
			return x;
		}else{
			int x = ((n>>bits)|(n<<(NO_OF_BITS-bits)));
			return x;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the direction of shift: ");
		String direction = sc.nextLine();
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("Enter the number of  bits to shift: ");
		int bits = sc.nextInt();
		System.out.println("Number after the mentioned shift is: " + performShift(num, bits, direction));
	}
}