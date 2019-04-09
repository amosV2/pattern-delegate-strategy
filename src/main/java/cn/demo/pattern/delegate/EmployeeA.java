package cn.demo.pattern.delegate;

public class EmployeeA implements IEmployee {
	@Override
	public void doJob(String command) {
		System.out.println("A:doing" + command);
	}
}
