package check;

import constants.Constants;

public class Check {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("printNameメソッド → " + printName(firstName, lastName));
		Pet a = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		a.introduce();
		RobotPet b = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		b.introduce();
	}
	private static String firstName = "大久保";
	private static String lastName = "樹";
	
	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
	
	
}
