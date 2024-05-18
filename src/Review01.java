
public class Review01 {

	public static void main(String[] args) {
		double price = 1500;
		double taxRate = 10;

		double tax = taxMethod(price, taxRate);
		System.out.println(Math.round(price) + "円の商品の税込価格は" +Math.round(price + tax) + "円（消費税は" + Math.round(tax) + "円）です。");

	}

	public static double taxMethod(double price,double taxRate) {

		double tax = (price * (taxRate/100));
		return tax;
	}
}
