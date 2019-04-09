package cn.demo.pattern.strategy;

public class AliPay extends Payment {
	@Override
	public void getName() {
		System.out.println("使用支付宝支付");
	}

	@Override
	public int queryBalance(String uid) {
		return 500;
	}
}
