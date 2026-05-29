package d48;

public class Q26 {
    static void main(String[] args) {
        int i = 0, sum = 0;
        while (++i < 8) {
            sum += i;
        }
        System.out.print(sum);
    }
}
/*
【動きの確認】
１回目：１が０から１に増える　→　１＜８　はOK　＋　sumに１を足す
（中省）
７回目：１が６から７に増える　→　７＜８　はOK　＋　sumに７を足す
８回目：１が７から８に増える　→　８＜９　はOK　＋　sumに８を足す
答えは「２８」となる
 */
