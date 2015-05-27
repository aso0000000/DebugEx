package pac;
/**
 * デバッグ用のサンプル
 * ブレークポイントや変数ビューを確認する
 * @author imamura
 *
 */
public class Top {
	public static void main(String[] args){
		int cnt=0;
		System.out.println("main1 in cnt="+cnt++);
		one();
		System.out.println("main2 out cnt="+cnt++);
	}
	static void one(){
		System.out.println("one1 in");
		two();
		System.out.println("one2 out");
	}

	static void two(){
		System.out.println("two1 in");
		System.out.println("two2 out");
	}
}
