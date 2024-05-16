
public class CastSample {

	public static void main(String[] args) {
		// int型変数の宣言及び初期化
		int a = 3;
		int b = 2;

		// int型同士の除算（結果はint型）
		System.out.println(a / b);

		// int型aを一時的にdouble型に変換して除算する（結果はdouble型）
		System.out.println((double)a / b);

		// int型同士の除算をした結果（int型）をdouble型に型変換
		System.out.println((double)(a / b));

	}

}
