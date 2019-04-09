package cn.demo.pattern.strategy;

public abstract class Payment {

	public abstract void getName();

	public abstract int queryBalance(String uid);

	public PayState pay(String uid,int price){
		getName();
		int balance = queryBalance(uid);
		if (price > balance) {
			return new PayState("500","支付失败，月余额不足");
		}else {
			return new PayState("200","支付成功");
		}

	}


}
