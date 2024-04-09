package kadai_021;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {

		//クラスのインスタンスを生成する。
		Dictionary_Chapter21 chapter21 = new Dictionary_Chapter21();

		//辞書の中にデータを格納する。
		HashMap dictionaly = chapter21.fruitKanri();

		//辞書を検索するワードを格納するリストを生成
		String targetWord[] = new String[4];

		//1つめの言葉を追加
		targetWord[0] = "apple";

		//2つめの言葉を追加
		targetWord[1] = "banana";

		//3つめの言葉を追加
		targetWord[2] = "grape";

		//4つめの言葉を追加
		targetWord[3] = "orange";

		//検索するメソッド
		chapter21.fruitdict(dictionaly, targetWord);

		//Dictionary_Chapter21.fruitdict();
	}
}

