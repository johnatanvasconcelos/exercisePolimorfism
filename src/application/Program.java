package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Employee #" + i + " data: ");
			System.out.print("Outsourced? (y/n)");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHours = sc.nextDouble();
			
			if(ch == 'y') {
				 System.out.print("Additional charge");
				 double additionalCharge = sc.nextDouble();
				 list.add(new OutSourcedEmployee(name, hours, valuePerHours, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHours));
			}
		}
		
		System.out.println();
		System.out.println("Payments: ");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $" + emp.payment());
		}
		
		sc.close();
	}
}
