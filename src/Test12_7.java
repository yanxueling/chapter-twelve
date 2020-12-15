import java.util.Scanner;
//在Test12_6的基础上修改成不是一个二进制字符串抛出NumberFormatException异常
public class Test12_7 {

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
	
	public static int binCharToDecimal(char ch) throws java.lang.NumberFormatException { 
		if (ch == '0' || ch <= '1')
			return ch;
		else throw new java.lang.NumberFormatException("The number you entered is not binary!");
	}
}
