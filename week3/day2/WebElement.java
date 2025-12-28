package week3.day2;

public class WebElement {
	
	public void click() {
		System.out.println("click method");
	}

	public void setText(String text) {
		System.out.println("String parameter: "+ text);
		
	}
	public static void main(String[] args) {

    WebElement element = new WebElement();
    element.setText("Hello");
	}
}