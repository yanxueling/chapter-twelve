import java.util.Scanner;
//在Test12_6的基础上定义一个HexFormatException的自定义异常
public class Test12_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
				
		// Prompt the user to enter a String
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
				
		try {
			System.out.println("The decimal value for hex number " + hex+ " is " + hexToDecimal(hex.toUpperCase()));
		} catch (HexFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	public static int hexToDecimal(String hex) throws HexFormatException {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
			
	public static int hexCharToDecimal(char ch) throws HexFormatException {
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9')	
			return ch - '0';
		else throw new HexFormatException(ch);
	}
}

class HexFormatException extends Exception{
	private char ch;
			
	public HexFormatException(char ch) {
		super("HexFormatException: " + ch);
		this.ch = ch;
	}
			
	public char getCh() {
		return ch;
	}
}
