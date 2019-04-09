package cn.demo.pattern.delegate;

public class Boss {

	public void command(String command,Leader leader) throws Exception {
		leader.doing(command);

	}

}
