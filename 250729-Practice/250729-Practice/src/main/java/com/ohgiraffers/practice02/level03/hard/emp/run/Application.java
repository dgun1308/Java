package com.ohgiraffers.practice02.level03.hard.emp.run;

import com.ohgiraffers.practice02.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        EmployeeDTO employeeDTO = new EmployeeDTO();
        Scanner sc = new Scanner(System.in);

        System.out.print("number : ");
        employeeDTO.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.print("name : ");
        employeeDTO.setName(sc.nextLine());

        System.out.print("dept : ");
        employeeDTO.setDept(sc.nextLine());

        System.out.print("job : ");
        employeeDTO.setJob(sc.nextLine());

        System.out.print("age : ");
        employeeDTO.setAge(sc.nextInt());
        sc.nextLine();

        System.out.print("gender : ");
        employeeDTO.setGender(sc.next().charAt(0));
        sc.nextLine();

        System.out.print("salary : ");
        employeeDTO.setSalary(sc.nextInt());

        System.out.print("bonusPoint : ");
        employeeDTO.setBonusPoint(sc.nextDouble());
        sc.nextLine();

        System.out.print("phone : ");
        employeeDTO.setPhone(sc.nextLine());

        System.out.print("address : ");
        employeeDTO.setAddress(sc.nextLine());

        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());

    }
}
