import javax.swing.JOptionPane;

public class CeaserCipher
{

	public static void main(String[] args) 
	{
		//gets a string to encrypt
		String str = (JOptionPane.showInputDialog("Input Data to encypt:"));
		
		//gets a key 
		String key = (JOptionPane.showInputDialog("Input the key:"));
		int keyLength=str.length();
		
	
		
		//prints encryption
		String encrypted = encrypt(str, keyLength);
		System.out.println("Encrypted:" + encrypted);

		//prints decryption
		String decrypted = decrypt(encrypted, keyLength);
		System.out.println("Decrypted:" + decrypted);
	}

	public static String encrypt(String str, int keyLength) 
	{
		String encrypted = "";
		for(int i = 0; i < str.length(); i++) 
		{
			int c = str.charAt(i);
			
			int key = 0;
			if (Character.isUpperCase(c)) 
			{
				//26 letters of the alphabet so mod by 26
				c = c + (key % 26);
				if (c > 'Z')
				c = c - 26;
			} 
			else if (Character.isLowerCase(c)) 
			{
				c = c + (key % 26);
				if (c > 'z')
				c = c - 26;
			}
			encrypted += (char) c;
		}
	return encrypted;
	}

	public static String decrypt(String str, int key) 
	{
		String decrypted = "";
		for(int i = 0; i < str.length(); i++) 
		{
			int c = str.charAt(i);
			if (Character.isUpperCase(c)) 
			{
				c = c - (key % 26);
				if (c < 'A')
				c = c + 26;
		} 	
			else if (Character.isLowerCase(c)) 
			{
				c = c - (key % 26);
				if (c < 'a')
				c = c + 26;
			}
			decrypted += (char) c;
		}
		return decrypted;
	}
}



