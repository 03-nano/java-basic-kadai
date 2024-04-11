package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {

		//カトハナのインスタンスを生成
		KatoHanako_Chapter18 katoHana = new KatoHanako_Chapter18();

		//カトタロのインスタンスを生成
		KatoTaro_Chapter18 katoTaro = new KatoTaro_Chapter18();

		//カトイチのインスタンスを生成
		KatoIchiro_Chapter18 katoIchi = new KatoIchiro_Chapter18();

		//各子クラスの名前を設定する。
		katoHana.setGivenName();
		katoTaro.setGivenName();
		katoIchi.setGivenName();

		//各自の自己紹介を実行する。
		katoHana.execIntroduce();
		katoTaro.execIntroduce();
		katoIchi.execIntroduce();
	}

}