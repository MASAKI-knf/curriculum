public class Task1_2 {

    public static void main(String[] args) {

// ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = {"JAPAN", "AMERICA", "KOREA"};

// ② ①で作成した配列の要素数を出力してください。
        System.out.println("配列countryの要素数…"+ country.length);

/* ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。
         *   1番目（先頭）の要素に 「りんご」 を代入
         *   2番目の要素に 「もも」 を代入
         *   3番目の要素に 「ぶどう」 を代入
         */
        String[] strArray = {"りんご","もも","ぶどう"};

        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        System.out.println("strArray[1]…"+strArray[1]);


//⑤10、20、30、40、50を要素値とする、５個の要素数をintArrayという名前のint型配列で宣言している。
        int[] intArray = {10,20,30,40,50};

//⑥20(右から２番目)と50(右から５番目)の要素値を合計して出力している。
        System.out.println(intArray[1]+intArray[4]);



    }
}

