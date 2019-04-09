package cn.demo.pattern.strategy;

public class WXPay extends Payment {
	@Override
	public void getName() {
		System.out.println("使用微信支付");
	}

	@Override
	public int queryBalance(String uid) {
		return 300;
	}
}
