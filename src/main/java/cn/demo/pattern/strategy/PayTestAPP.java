package cn.demo.pattern.strategy;

public class PayTestAPP {

	public static void main(String[] args) {
		Order order = new Order("1", 1200, "13");
		PayState pay = order.pay(PayStrategyFactory.PayKey.WX_PAY);
		System.out.println(pay);
	}

}
