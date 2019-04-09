package cn.demo.pattern.strategy;

public class Order {

	private String orderId;

	private int price;

	private String uid;

	public PayState pay(String payKey){
		Payment payment = PayStrategyFactory.getInstance(payKey);
		PayState payState = payment.pay(this.uid, this.price);
		return payState;
	}

	public Order(String orderId, int price, String uid) {
		this.orderId = orderId;
		this.price = price;
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "Order{" +
				"orderId='" + orderId + '\'' +
				", price=" + price +
				", uid='" + uid + '\'' +
				'}';
	}
}
