package kadai_018;

public abstract class Kato_Chapter18 {
	public String familyName = "加藤"; //姓を表す
	public String givenName; //名を表す
	public String address = "住所は東京都中野区〇×です"; //住所を表す

	public void commonIntroduce() { //共通の紹介を出力
		System.out.println("名前：" + familyName + " "+ givenName);
		System.out.println("住所：" + address);
	}
	
	public abstract void eachIntroduce(); //各サブクラスで個別に実装する必要があります

	public void execIntroduce() { //紹介を実行する
		commonIntroduce(); //共通の紹介
		eachIntroduce(); //個別の紹介
	}
}