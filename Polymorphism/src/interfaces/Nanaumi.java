package interfaces;

/**
 * 2. 司令をこなす側: 七海クラス
 * <pre>public interface インターフェース名 {}<pre>
 */
public class Nanaumi implements OrderFromMotoki , OrderFromShihandai{
 
 private String name;
 private String date;
 
 public Nanaumi(String n, String yyyyMM) {
 name = n;
 date = yyyyMM;
 }
 
 /* 
 * 司令（インターフェース）が増えた際にOverrideした各メソッドそれぞれを修正することになると、
 * 修正箇所を探すことは大変だし、賢くない書き方になるので一箇所にまとめましょう！
 * 以下はOverrideしたメソッドの処理を実行する際に、フラグを立てて該当す処理をさせるメソッドの例
 */
  // 司令をこなす！
 private void submitOrder(final int shoriFlg) {
 String nameAnd = name + "、";
 
 if (shoriFlg == 0) {
  // 勤務表
 System.out.println(nameAnd + date + "の勤務表出しました(｀･ω･´)ゞ！！！！！！");
 } else if (shoriFlg == 1) {
  // 交通費
 System.out.println(nameAnd + date + "の交通費も出しました(｀･ω･´)ゞ！！！！！！");
 } else {
  // その他
 System.out.println(nameAnd + "本当はまだ何も出してません(｀･ω･´)ドヤ！！！！！！");
 }
 }
 
  // 言いづらいけど、何もしてません！←
 public void doNothing() {
 submitOrder(-1);
 }
 
 /* ----- インターフェースのメソッドを Override して {} 内に 処理を記述！ ----- */
 
 @Override
  // 勤務表出せや！: OrderFromMotoki
 public void daseyaKinmuhyo() {
 submitOrder(0);
 }
 
 @Override
  // できれば交通費も出せや！: OrderFromMotoki
 public void daseyaKotsuhi() {
 submitOrder(1);
 }
 
 @Override
  // セブンイレブン行けや！: OrderFromMotokiのお邪魔虫メソッド
  // （わざわざsubmitOrder(int)で処理させる必要もないよね！
 public void goToSevenEleven() {
 System.out.println("先にセブンイレブン行ってきやす！");
 }
//... もときさんの司令とか
 
@Override
// Javaカリキュラム作れ！: OrderFromShihandai
public String doCreateJavaCurriculum() {
return "Javaカリキュラム完成しました！";
}
}
