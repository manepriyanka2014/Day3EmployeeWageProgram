public class EmployeeWageUC1 {
	public static void main(String[] args) {
		System.out.println("Welcome to EmployeeWage");
		int IS_FULL_TIME = 2;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");

	}

}
