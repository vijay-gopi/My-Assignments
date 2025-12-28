package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="TestLeaf";
		String str2="";
		for (int i = companyName.length()-1; i >= 0; i--){

			str2 =  str2 + companyName.charAt(i);
		}
		System.out.print(str2);
		
		System.out.print("\n");
		
        char[] charArray = companyName.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
    		
            System.out.print(charArray[i]);

	}

}
}
