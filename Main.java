package pro.sky.java.course1.course_work;

public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main (String[] args) {
        Employee anna = new Employee("Анна Леонидовна Большова", 1, 6_000);
        Employee evgeniy = new Employee("Евгений Александрович Евстегнеев", 3, 202_000);
        Employee olga = new Employee("Ольга Фёдоровна Берггольц", 1, 123_000);
        Employee ryslan = new Employee("Руслан Габидуллин", 2, 300_000);
        Employee ryslan2 = new Employee("Руслан Габидуллин", 2, 300_000);
        Employee anna3 = new Employee("Анна Леонидовна Меньшова", 1, 6_000);
        System.out.println(ryslan);
        ryslan.setSalary(400_000);
        ryslan.setDepartment(5);
        System.out.println(ryslan);
        System.out.println("Employee.getCounter() = " + Employee.getCounter());
        System.out.println(ryslan.getId());
        System.out.println(ryslan.getDepartment());
        EmployeesService.printFullNameAll(employees);
        System.out.println();
        EmployeesService.getEmployeesInfo(employees);
        System.out.println();
        System.out.println("Сумма затрат в месяц: " + EmployeesService.calculatePayrollCosts(employees));
        System.out.println("Среднее значение зарплат: " + EmployeesService.calculateAverageSalary());
        System.out.println("Сотрудник с максимальной зарплатой: \n" + EmployeesService.findMaxSalaryEmployee(employees));
        System.out.println("Сотрудник с минимальной зарплатой: \n" + EmployeesService.findMinSalaryEmployee(employees));
        System.out.println("************");
        EmployeesService.assignToEmployeesArray(ryslan2);
        System.out.println(Employee.getCounter());
        System.out.println(ryslan2);
        System.out.println("*******************");
        EmployeesService.print(employees);
        System.out.println("*******************");

        System.out.println(Employee.getCounter());

    }
}
