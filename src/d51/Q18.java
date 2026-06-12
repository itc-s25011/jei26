package d51;

public class Q18 {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 9; i += 2) {
            System.out.println(++i);
        }
    }
}
/*
【メモ】iの変化の様子
１回目のループ終了時：０→１→３
２回目のループ終了時：３→４→６
３回目のループ終了時：６→７→９
(1=9はi<は9未満ではないため繰り返し終了となる）

出力；１
 */