package check;

import constants.Constants;

public class Check {

	// フィールド
	private static String firstName = "大橋";
	private static String lastName = "一夫";

    // メソッド
    private static void printName( String firstName, String lastName) {
        System.out.println("printNameメソッド　→　" + firstName + lastName);
    }

	public static void main(String args[]) {
		//課題①・課題②
		printName( firstName, lastName);

		//課題③
		Pet pet = new Pet( Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robot = new RobotPet( Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robot.introduce();
	}
}
