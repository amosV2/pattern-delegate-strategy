package cn.demo.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

	private static final Map<String,IEmployee> target = new HashMap<>();

	static {
		target.put("A",new EmployeeA());
		target.put("B",new EmployeeB());
	}

	public void doing(String command) throws Exception {
		getEmp(command).doJob(command);
	}

	public static IEmployee getEmp(String key) throws Exception {
		IEmployee emp = target.get(key);
		if (emp != null) {
			return emp;
		}
		throw new Exception("没有适合的员工");
	}

}
