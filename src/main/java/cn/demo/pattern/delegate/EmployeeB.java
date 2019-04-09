package cn.demo.pattern.delegate;

public class EmployeeB implements IEmployee {


	@Override
	public void doJob(String command) {
		System.out.println("B:doing" + command);
	}

}
