public class Task1_3 {

    public static void main(String[] args) {

        // ① 5 と 10 を加算した値を代入する、変数 plus を作成しなさい。
        int plus = 5 + 10;

        // ② 20 から 7 を減算した値を代入する、変数 minus を作成しなさい。
        int minus = 20 - 7;
        
        // ③下記の処理について、何をしているのかコメントを記入してください。
        // 変数 multiply を作成し、10と2を掛けた値を代入している。
        int multiply = 10 * 2;

        // ④ 20 を 6 で割った余りを代入する、変数 remi を作成しなさい。
        int remi = 20;
        remi %= 6;

        // ⑤下記の処理について、何をしているのかコメントを記入してください
        // 変数 town には有楽町を、変数 line には線をそれぞれ代入している。
        String town = "有楽町";
        String line = "線";

        // ⑥ ⑤で作成した変数を連結させた値を代入する変数 train を作成しなさい。
        String train = town + line;

        // ⑦ 変数plus, minus, multiply, remi, train をそれぞれ出力しなさい。
        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi);
        System.out.print(train);
        
        

    }
}