package application;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        int createEmployees;

        System.out.println("Enter the number of employees: ");
        createEmployees = tc.nextInt();

        for (int i = 0; i < createEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.println("Outsorced (y/n)?");
            String out = tc.next();
            System.out.println("Name: ");
            String name = tc.next();
            System.out.println("Hours: ");
            int hours = tc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = tc.nextDouble();
            if (out.equalsIgnoreCase("y")) {
                System.out.println("Additional charge: ");
                Double additionalCharge = tc.nextDouble();
                Employee employ = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(employ);
            } else {
                Employee employ = new Employee(name, hours, valuePerHour);
                list.add(employ);
            }

        }
        System.out.println("Payments: ");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " $ " + list.get(i).payment());
        }
    }
}
