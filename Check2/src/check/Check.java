package check;

import constants.Constants;
public class Check {

	private static String firstName = "Koori";
	private static String lastName = "Masaki";
	
	public static void main(String[] args) {
		System.out.println("printlnメソッド→" + firstName+lastName);
		
		 printName(firstName,lastName);
		
		
		Pet A = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		A.introduce();
		
		RobotPet B = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		B.introduce();
		
			
		 
	}

	private static void printName(String firstName, String lastName) {
		
	}

}
//課題①
//【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
//firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
//なお、変数のアクセス修飾子は「private」とする。

//課題②
//【Check.java】にてfirstNameとlastNameを引数で受け取って、
//連結して表示させるメソッド「printName」を作成しなさい。
//作成した関数のアクセス修飾子は「private」とする。

//課題③
//【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。
//printNameメソッド→七海真弥
//◆僕の名前はJava吉です
//■ご主人様はhogeです
//◆私はロボット。名前はR2D2。
//◆ご主人様はルーク。
