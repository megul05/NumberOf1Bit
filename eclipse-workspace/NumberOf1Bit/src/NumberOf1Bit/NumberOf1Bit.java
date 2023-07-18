package NumberOf1Bit;
import java.util.*;

public class NumberOf1Bit {
	
	 public static int numberOfBits(int number){
	        int count = 0;
	        while (number > 0){
	            count += ((number & 1) == 0) ? 0 : 1;
	            number = number >> 1 ;
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int result = numberOfBits(number);
		System.out.println(result);
	}

}
