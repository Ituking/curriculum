/** 
 * Task1-5 : 課題内容
 *
 * 本課題では、ルーブ文に記述に慣れていきましょう。
 * 問①〜問④まであります。
 * for文・while文の仕組みを意識しながらコーディングしていきましょう！
 */
public class Task1_5 {
    public static void main(String[] args) {
        
        // ① 「みかん」、「りんご」、「ぶどう」、「メロン」の値を設定した配列 fruits を作成してください。
        String[] fruits = {"みかん", "りんご", "ぶどう", "メロン"};
        
        // System.out.println(fruits[0]);
        // System.out.println(fruits[1]);
        // System.out.println(fruits[2]);
        // System.out.println(fruits[3]);

        // ② for文を使って①で作成した配列を出力しなさい。
        for (String i = 0; i < 3; i++) {
            System.out.println(fruits[i);
        }
        
        // ③ 以下のwhile文の処理について、何をしているのかコメントを記入してください。
        /*
        *  [int型の変数iを定義し、初期値に1を代入、その後100までの間で一個ずつ増えて出力される表示を書いている]
        */
        int i = 1;
        while(i <= 100) {
          System.out.print(i);
          i++;
        }
        System.out.println();

        /* ④ 行の最初に「段数」と「||」を追加したものを表示させるプログラムを作成しなさい。
        *     1 || 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
        *     2 || 2 | 4 | 6 | 8 | 10 | 12 | 14 | 16 | 18 |
        *     3 || 3 | 6 | 9 | 12 | 15 | 18 | 21 | 24 | 27 |
        *     4 || 4 | 8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 |
        *     5 || 5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 |
        *     6 || 6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 |
        *     7 || 7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 |
        *     8 || 8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 |
        *     9 || 9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 |
        */
        // for (int x = 1; x <= 9; x++) {
        //     for (int k = 1; k <= 9; k++) {
        //         System.out.print(x + "||" + x + "×" + k + "=" + (x * k));
        //     }        
        // }
        // for (int z = 1; z <= 9; z++) {
        //     System.out.println(z + " || ");
        // }
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.print(" " + x * y);
            }System.out.println();
        }
    }
}