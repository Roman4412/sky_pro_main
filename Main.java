package pro.sky.java.course1.course_work;

public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main (String[] args) {
        Employee anna = new Employee("Анна Леонидовна Большова", 1, 6_000);
        Employee evgeniy = new Employee("Евгений Александрович Евстегнеев", 3, 202_000);
        Employee olga = new Employee("Ольга Фёдоровна Берггольц", 1, 123_000);
        Employee ryslan = new Employee("Руслан Габидуллин", 2, 300_000);

        System.out.println(ryslan);
        ryslan.setSalary(400_000);
        ryslan.setDepartment(5);
        System.out.println(ryslan);
        System.out.println("Employee.getCounter() = " + Employee.getCounter());

        EmployeesService.printFullNameAll(employees);
        System.out.println();
        EmployeesService.getEmployeesInfo(employees);
        System.out.println();
        System.out.println("Сумма затрат в месяц: " + EmployeesService.calculatePayrollCosts(employees));
        System.out.println("Среднее значение зарплат: " + EmployeesService.calculateAverageSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: \n" + EmployeesService.findMaxSalaryEmployee(employees));
        System.out.println("Сотрудник с минимальной зарплатой: \n" + EmployeesService.findMinSalaryEmployee(employees));
        print();
    }

    public static void print() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

}
