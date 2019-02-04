import java.util.Scanner;
class RailFence{
 public static void main(String args[])throws Exception
 {
  RailFenceBasic rf=new RailFenceBasic(); 
                Scanner scn=new Scanner(System.in);
                int depth;
   
                String plainText,cipherText,decryptedText;
                 
                System.out.println("Enter plain text:");
                plainText=scn.nextLine();
                 
                System.out.println("Enter depth for Encryption:");
                depth=scn.nextInt();
                
  cipherText=rf.Encryption(plainText,depth);
  System.out.println("Encrypted text is:\n"+cipherText);
                 
                decryptedText=rf.Decryption(cipherText, depth);
                 
  System.out.println("Decrypted text is:\n"+decryptedText);
   
 }
}