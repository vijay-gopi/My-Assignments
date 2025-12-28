package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

        String text = "We learn Java basics as part of java sessions in java week1";
        System.out.println("Orignial text : " +text);
        
        System.out.print("Corrected text : ");

        int c = 0;

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
        	
            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = "";   
                    c++;         
                }
            }
        }

        if (c > 1) {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals("")) {
                    System.out.print(words[i] + " ");
                }
            }
        }
    }
}
