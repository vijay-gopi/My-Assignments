package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {

		String s = "changeme";
		
        char[] charArray = s.toCharArray();
        
        for (int i = charArray.length - 1; i >= 0; i--) {

        	if (i % 2 != 0) {

                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println(charArray);

	}

}
