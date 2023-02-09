package pro.sky.java.course1.course_work;

public class EmployeesService {
    public static void getEmployeesInfo(Employee[] array){
        for (Employee employee : array) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double calculatePayrollCosts(Employee[] array) {
        double payrollCosts = 0;
        for (Employee employee : array) {
            if (employee != null) {
                payrollCosts += employee.getSalary();
            }
        }
        return payrollCosts;
    }

    public static Employee findMinSalaryEmployee(Employee[] array) {
        double minSalaryEmployee = Double.MAX_VALUE;
        Employee employeeMin = null;

        for (Employee employee : array) {
            if (employee != null && employee.getSalary() < minSalaryEmployee) {
                minSalaryEmployee = employee.getSalary();
                employeeMin = employee;
            }
        }
        return employeeMin;
    }
    public static Employee findMaxSalaryEmployee(Employee[] array) {
        double maxSalaryEmployee = Double.MIN_VALUE;
        Employee employeeMax = null;

        for (Employee employee : array) {
            if (employee != null && employee.getSalary() > maxSalaryEmployee) {
                maxSalaryEmployee = employee.getSalary();
                employeeMax = employee;
            }
        }
        return employeeMax;
    }

    public static double calculateAverageSalary() {
        return calculatePayrollCosts(Main.employees) / Employee.getCounter();
    }

    public static void printFullNameAll(Employee[] array) {
        for (Employee employee : array) {
            if (employee != null)
                System.out.println(employee.getFullName());
        }
    }

}
