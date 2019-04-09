package cn.demo.pattern.strategy;

public class PayState {

	private String stateCode;

	private String message;

	public PayState(String stateCode, String message) {
		this.stateCode = stateCode;
		this.message = message;
	}

	@Override
	public String toString() {
		return "PayState{" +
				"stateCode='" + stateCode + '\'' +
				", message='" + message + '\'' +
				'}';
	}
}
