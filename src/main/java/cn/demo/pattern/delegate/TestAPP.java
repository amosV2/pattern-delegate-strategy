package cn.demo.pattern.delegate;

public class TestAPP {

	public static void main(String[] args) throws Exception {
		Boss boss = new Boss();
		Leader leader = new Leader();
		boss.command("C",leader);
	}

}
