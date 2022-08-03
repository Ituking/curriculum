package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 本課題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Study {

	public static final String SHOP_SHOHIN_00 = "バナナ";
	public static final String SHOP_SHOHIN_01 = "牛乳";
	public static final String SHOP_SHOHIN_02 = "豚肉";
	public static final String SHOP_SHOHIN_03 = "コロッケ";

	public static void main(String args[]) {

		// ① 定数を全て使って、String型のListを記述してください。
		List<String> shohinList = new ArrayList<String>();
		shohinList.add("バナナ");
		shohinList.add("牛乳");
		shohinList.add("豚肉");
		shohinList.add("コロッケ");
		
		// ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、コメントを記述してください。
		/*
		 * [ここへ記述]
		 *変数shopMapにputメソッドで要素の追加を行なっている。
		 *この場合だとshohinListから取り出してきた2番目の要素1に対応する値「180」をgetメソッドで取り出し、
		 *その取り出してきた値をputメソッドで追加している。
		 */
		LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
		shopMap.put(shohinList.get(0), 125);
		shopMap.put(shohinList.get(1), 180);
		shopMap.put(shohinList.get(2), 350);
		shopMap.put(shohinList.get(3), 100);

		// ③ カリキュラムを参考に拡張for文を使って、課題の画像と同じ表示になるよう記述してください。
		// 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
//		for (String a : shohinList) {
//			System.out.print(a + "=");
//			for (int b : shopMap.values()) {
//				System.out.print(b);
//			}System.out.println("円になります！");
//		}
		
		for (Map.Entry<String, Integer> a : shopMap.entrySet()) {
			System.out.println(a.getKey() +  "=" + a.getValue() + "円になります！");
		}
	}
}