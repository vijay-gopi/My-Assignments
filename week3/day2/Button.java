package week3.day2;

public class Button extends WebElement{
	public void submit() {
		System.out.println("submit buttom clciked method called");
	
	}
	public static void main(String[] args) {
        Button button = new Button();
        button.submit();
	}

}