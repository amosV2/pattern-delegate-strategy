package cn.demo.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PayStrategyFactory {

	private static Map<String,Payment> paymentMap = new HashMap<>();

	static {
		paymentMap.put(PayKey.ALI_PAY,new AliPay());
		paymentMap.put(PayKey.JD_PAY,new JDPay());
		paymentMap.put(PayKey.WX_PAY,new WXPay());
		paymentMap.put(PayKey.ALI_PAY,new AliPay());
	}

	public static Payment getInstance(String payKey){
		Payment payment = paymentMap.get(payKey);
		return payment == null ? paymentMap.get(PayKey.DEFAULT) : payment;
	}

	interface PayKey {
		String ALI_PAY = "ali";

		String WX_PAY = "wx";

		String JD_PAY = "jd";

		String DEFAULT = "ali";
	}

}

