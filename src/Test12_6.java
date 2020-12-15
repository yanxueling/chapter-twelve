import java.util.Scanner;
//在程序清单6-8的基础上修改成不是一个十六进制字符串抛出NumberFormatException异常
public class Test12_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a String
		System.out.print("Enter a hex number: ");
		String hex = input.nextLine();
				
		System.out.println("The decimal value for hex number " + hex+ " is " + hexToDecimal(hex.toUpperCase()));
	}

	public static int hexToDecimal(String hex) {
		int decimalValue = 0;
		for (int i = 0; i < hex.length(); i++) {
			char hexChar = hex.charAt(i);
			decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
		}
		
		return decimalValue;
	}
	
	public static int hexCharToDecimal(char ch) throws java.lang.NumberFormatException { 
		if (ch >= 'A' && ch <= 'F')
			return 10 + ch - 'A';
		else if (ch >= '0' && ch <= '9') 
			return ch - '0';
		else throw new java.lang.NumberFormatException("The number you entered is not hexadecimal!");
	}
}
