package pro.sky.java.course1.course_work;

public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main (String[] args) {
        employees[0] = new Employee("Анна Леонидовна Большова", 1, 6_000);
        employees[1] = new Employee("Евгений Александрович Евстегнеев", 3, 202_000);
        employees[2] = new Employee("Ольга Фёдоровна Берггольц", 1, 123_000);
        employees[3] = new Employee("Руслан Габидуллин", 2, 300_000);
        employees[4] = new Employee("Руслан Габидуллин", 2, 300_000);

        System.out.println(employees[0]);
        employees[3].setSalary(400_000);
        employees[3].setDepartment(5);
        System.out.println(employees[3]);
        System.out.println("Employee.getCounter() = " + Employee.getCounter());
        System.out.println(employees[3].getId());
        System.out.println(employees[3].getDepartment());
        EmployeesService.printFullNameAll(employees);
        System.out.println();
        EmployeesService.getEmployeesInfo(employees);
        System.out.println();
        System.out.println("Сумма затрат в месяц: " + EmployeesService.calculatePayrollCosts(employees));
        System.out.println("Среднее значение зарплат: " + EmployeesService.calculateAverageSalary());
        System.out.println("Сотрудник с максимальной зарплатой: \n" + EmployeesService.findMaxSalaryEmployee(employees));
        System.out.println("Сотрудник с минимальной зарплатой: \n" + EmployeesService.findMinSalaryEmployee(employees));
        System.out.println("************");

        System.out.println(Employee.getCounter());
        System.out.println(employees[4]);
        System.out.println("*******************");
        EmployeesService.print(employees);
        System.out.println("*******************");

        System.out.println(Employee.getCounter());

    }
}
