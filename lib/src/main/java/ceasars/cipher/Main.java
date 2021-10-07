package ceasars.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
		int offset = 12;
		
		CeasarCipher ceasarsCipher = new CeasarCipher();
		String cipheredMessage = ceasarsCipher.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("offset: " + offset);
		System.out.println("ciphered Message: " + cipheredMessage);
	}

}
