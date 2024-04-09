package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	//フルーツ辞書のデータを管理するメソッド
	public HashMap fruitKanri() {
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		return dictionary;
	}

	//辞書を調べるメソッド
	public void fruitdict(HashMap dictionary, String[] targetWord) {
		for (String word : targetWord) {
			boolean exist = dictionary.containsKey(word);
			if (exist) {
				System.out.println(word + "の意味は" + dictionary.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}


