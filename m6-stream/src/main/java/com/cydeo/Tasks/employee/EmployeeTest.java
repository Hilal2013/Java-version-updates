package com.cydeo.Tasks.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
    public static void main(String[] args) {
        //now no need EmployeeData.stream()//because returns Stream
        System.out.println("Print All Emails");
        EmployeeData.readAll()
             //   .map(employee->employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);
     //mike.cydeo.com
        //ozzy.cydeo.com
        //peter.cydeo.com

        System.out.println("Print All PhoneNumbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);
        //[2002345, 78904563]
        //[290023457, 12334567]
        //[45678912, 98765432]// it returns Stream
//how im gonna this without brackets
        //employee has more than one phonenumber map does one to one mapping . map is not gonna work this one
//what flatMap is accepting Stream of Stream but here just Stream
        EmployeeData.readAll()
               // .flatMap(Employee::getEmpPhoneNumbers) error
                .flatMap(employee->employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        //2002345
        //78904563
        //290023457
        //12334567
        //45678912
        //98765432

        System.out.println("Print All Phone numbers with double colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)//stream
                .flatMap(List:: stream)
                .forEach(System.out::println);

        Map<String,String> map=EmployeeData.readAll()
                .collect(Collectors.toMap(first->first.getEmpName().substring(0,1),last->last.getEmpEmail().substring(0,1)));
        System.out.println(map);
List<String> list=new ArrayList<>();

        for (Map.Entry<String, String> eachPair : map.entrySet()) {
            list.add(eachPair.getKey()+eachPair.getValue());
        }

    }
}
