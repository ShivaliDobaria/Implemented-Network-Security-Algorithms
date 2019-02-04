import java.lang.*;
import java.util.*;

public class SubstitutionCipher
{
public static void main(String[] args)
 {
	Scanner stdIn = new Scanner(System.in);
	String encryptText; //text to encrypt
	int shiftValue; //number of spaces to shift
	String decryptText;
	
	//User enters text to encrypt
	System.out.print("Please enter text to encrypt");
	encryptText = stdIn.nextLine();
	
	//User enters shift value
	System.out.println("Please enter shift value");
	shiftValue = stdIn.nextInt();
	
	//System returns encrypted string
	String encryptedText = encrypt(encryptText , shiftValue); // text that has been encrypted
	System.out.println(encryptedText);
	
	//User enters text to decrypt
	System.out.print("Please enter text to decrypt");
	decryptText = stdIn.nextLine();
	
	//User enters shift value
	System.out.println("Please enter shift value");
	shiftValue = stdIn.nextInt();
	
	//System returns decrypted string
	String decryptedText = decrypt(decryptText , shiftValue); // text that has been decrypted
	System.out.println(decryptedText);
	}

	
	//Shift and manipulate characters
	public static String shift(String enteredText, int shiftValue) 
	{
		
		String convertedText = "";
		for(int i = 0; i< enteredText.length(); i++){
		char lowerCase = enteredText.charAt(i);
		
		//Convert to upper case letters
		char lowerCase1 = Character.toUpperCase(lowerCase);
		int upperLetter = 0;
		int charNumber = upperLetter;
		
		//Shift letters and wrap text
		int rotateLetters = (charNumber + shiftValue) % 26;
		char rotateShift = 0;
		char shiftLetters = (char) rotateShift;
		
		//Populate new string of characters
		convertedText += shiftLetters;
	}
	return convertedText;
}

	//Encryption
	public static String encrypt(String enteredText, int shiftValue)
	{
	String encryptedString = rotate(enteredText , shiftValue);
	return encryptedString;
	}
	
	private static String rotate(String enteredText, int shiftValue) {
		// TODO Auto-generated method stub
		return null;
	}


	//Decryption
	public static String decrypt(String enteredText, int shiftValue)
	{
	int negativeShiftValue = (-1) * (shiftValue);
	String decryptedString = rotate(enteredText , negativeShiftValue);
	return decryptedString;
	}
}