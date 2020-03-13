/**
 *  Class that encodes and decodes individual characters using a combination of the:
 *     ->"Caesar cipher"
 *     ->"Substitution Ciphers"
 *     ->"Enigma Machine"
 *   
 *    Jacob Manning
 *    CSCI 221, HW 3 Cipher
 *    I, Jacob Manning, certify that this is my individual work.
 *    
 */

package HW3;

public class Cipher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private String KEY;		// not static or final -> allows it to become mutable
    /**
     *  Constructs a default Cipher object.
	 *  Constructs a Cipher object with params.
	 * 	   ->stores user's key
	 *  Rotate method for key rotation.
	 *     -> first character to the end
     */
    public Cipher() {
	    this.KEY = "defghijklmnopqrstuvwxyzabc";
    }
    public Cipher(String KEY) {
		this.KEY = KEY;
	}
	private void rotate() {
    	KEY = KEY.substring(1) + KEY.charAt(0);
	}
    /**
     * Encodes a single character.
     *   @param ch the character to be encoded
	 *   Detects if ch is a Capital Letter.
	 *             -> Changes to lowercase, encodes according to the key, and changes
	 *                back to uppercase
	 *             -> calls rotate to reposition KEY letters
	 *   If ch is not a letter then rotate KEY and return the ch
	 *   If ch is already lowercase, sends to KEY for encoding, rotates KEY, and returns
     */
	public char encode(char ch) {
		if(Character.isUpperCase(ch)) {
			char  loweredLetter = Character.toLowerCase(ch);
			int index = Cipher.ALPHABET.indexOf(loweredLetter);
			loweredLetter = this.KEY.charAt(index);
			char secretLetter =Character.toUpperCase(loweredLetter);
			rotate();
			return secretLetter;
		}
		else if (!Character.isLetter(ch)) {
			rotate();
			return ch;
		}
	    int index = Cipher.ALPHABET.indexOf(ch);
	    char secretLetter = this.KEY.charAt(index);
	    rotate();
	    return secretLetter;
	}
    /**
     * Decodes a single character.
     *   @param ch the character to be decoded
     *   Detects if ch is a Capital Letter.
	 * 	 	-> Changes to lowercase, decodes according to the key, and changes
	 * 	 		back to uppercase
	 * 	 	-> calls rotate to reposition KEY letters
	 * 	 If ch is not a letter then rotate KEY and return the ch
	 * 	 If ch is already lowercase, sends to KEY for decoding, rotates KEY, and returns
     */
    public char decode(char ch) {
    	if(Character.isUpperCase(ch)) {
    		char  loweredLetter = Character.toLowerCase(ch);
    		int index = this.KEY.indexOf(loweredLetter);
    		loweredLetter = Cipher.ALPHABET.charAt(index);
    		char originalLetter = Character.toUpperCase(loweredLetter);
    		rotate();
    		return originalLetter;
    	}
    	else if (!Character.isLetter(ch)) {
    		rotate();
			return ch;
		}
    	int index = this.KEY.indexOf(ch);
    	char originalLetter =  Cipher.ALPHABET.charAt(index);
    	rotate();
    	return originalLetter;
	}
}