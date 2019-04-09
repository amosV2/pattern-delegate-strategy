package cn.demo.pattern.strategy;

public class JDPay extends Payment {
	@Override
	public void getName() {
		System.out.println("使用京东白条");
	}

	@Override
	public int queryBalance(String uid) {
		return 200;
	}
}
