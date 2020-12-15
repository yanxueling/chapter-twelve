import java.util.Scanner;
//在Test12_7的基础上定义一个BinaryFormatException的自定义异常
public class Test12_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a String
		System.out.print("Enter a bin number: ");
		String bin = input.nextLine();
				
		System.out.println("The decimal value for bin number " + bin + " is " + binToDecimal(bin.toUpperCase()));
	}

	public static int binToDecimal(String bin) {
		return Integer.parseInt(bin,2);
	}
			
	public static int binCharToDecimal(char ch) throws BinaryFormatException { 
		if (ch == '0' || ch <= '1')
			return ch;
		else throw new BinaryFormatException(ch);
	}
}

class BinaryFormatException extends Exception{
	private char ch;
			
	public BinaryFormatException(char ch) {
		super("BinaryFormatException: " + ch);
		this.ch = ch;
	}
			
	public char getCh() {
		return ch;
	}
}
