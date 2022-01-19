package src.practice.factory;

import com.practice.dao.EmployeeDao;
import com.practice.dao.Impl.EmployeeDaoImpl;

public class EmployeeFactory {
	
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImpl();
	}

}
