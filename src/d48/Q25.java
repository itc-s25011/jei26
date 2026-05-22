package d48;

public class Q25 {
     String code; //フィールド(クラスが持つデータ)
    public static void main(String[]args){
        Q25 obj = new Q25(); //Q25クラスをインスタンス化して、objという名前の変数に格納
        obj.setcode("FB1257"); //objのsetcodeメソッドを使い、文字列をセットする
    }
    void setcode(String s) { // 引数で受け取った文字列をフィールド「code」に代入
       code = s;
    }
}
/*
【メモ】
javaでは文字列を指定する場合**（ダブルコーテーション）で囲む必要がある
**　（シングルコーテーション）は、１文字だけ（char型）を扱うときに使うので、混合しない
 */
