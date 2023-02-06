package pro.sky.java.course1.course_work;

import java.util.Objects;
public class Employee {
    /*
    ID изменяется при создании нового объекта ->
    возможно дублирование объектов( разные ID, при этом одинаковые поля) ->
    не учитывать ID при сравнении ->
    экзепшн при попытке записать, например, другого сотрудника с совпадающем ФИО
    */
    private final int ID;
    private static int counter = 0;
    private final String FULL_NAME;
    private int department;
    private double salary;
    private final int[] DEPARTMENTS = {1, 2, 3, 4, 5};

    public Employee(String fullName, int department, double salary) {
        ID = countOfInstances();
        FULL_NAME = fullName;
        this.department = setDepartment(department);
        this.salary = setSalary(salary);
        assignToEmployeesArray();
    }

    private void assignToEmployeesArray() {
        for (int i = 0; i < Main.employees.length; i++) {
            if (Main.employees[i] != null && Main.employees[i].equals(this)){
                System.out.println("Такой сотрудник уже существует");
                counter--;
                return;
            }
            if (Main.employees[i] == null) {
                Main.employees[i] = this;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Массив переполнен");
    }

    private int countOfInstances() {
        return ++counter;
    }
    // get get get get get get
    // get get get get get get
    // get get get get get get

    public int getId() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFullName() {
        return FULL_NAME;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // set set set set set set
    // set set set set set set
    // set set set set set set

    public int setDepartment(int newDepartment) {
        for (int j : DEPARTMENTS) {
            if (newDepartment > 0 && newDepartment == j) {
                return department = newDepartment;
            }
        }
        throw new IllegalArgumentException("Данного отдела не сущетвует");
    }

    public double setSalary(double newSalary) {
        if (newSalary > 0) {
            return salary = newSalary;
        }
        throw new IllegalArgumentException("Введено отрицательное значение");
    }
    @Override
    public String toString() {
        return  "id: " + ID
                + "\nФИО: " + FULL_NAME
                + "\nОтдел: " + department
                + "\nЗарплата: " + salary
                + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  department == employee.department
                && Double.compare(employee.salary, salary) == 0
                && FULL_NAME.equals(employee.FULL_NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FULL_NAME, department, salary);
    }
}
