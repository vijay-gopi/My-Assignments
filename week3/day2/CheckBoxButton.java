package week3.day2;

public class CheckBoxButton extends Button {

    public void clickCheckButton() {
        System.out.println("Checkbox button clicked");
    }
	public static void main(String[] args) {
    CheckBoxButton checkBox = new CheckBoxButton();
    checkBox.clickCheckButton();
    checkBox.submit();
	}
}
