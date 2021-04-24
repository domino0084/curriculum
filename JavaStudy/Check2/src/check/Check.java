package check;

import constants.Constants;

public class Check {

	// フィールド
    private String firstName;
	private String lastName;

    // コンストラクタ
    public Check() {
    	this.firstName = "大橋";
    	this.lastName  = "一夫";
    }

    // メソッド
    public void printName() {
        System.out.println("printNameメソッド　→　" + this.firstName + this.lastName);
    }

	public static void main(String args[]) {
		//課題①・課題②
		Check check = new Check();
		check.printName();

		//課題③
		Pet pet = new Pet( Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robot = new RobotPet( Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robot.introduce();
	}
}
