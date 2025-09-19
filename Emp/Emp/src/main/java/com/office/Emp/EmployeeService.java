package com.office.Emp;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class EmployeeService {
    private Employee employee;
    List<Employee> ls = new ArrayList<>();

    public void addEmployee(Employee employee){
        ls.add(employee);
    }

    public List<Employee> getEmployeeByDepartment(String dept){
        List<Employee> l1 = new ArrayList<>();
       for(Employee e:ls){
           if(e.getDepartment().equals(dept)){
               l1.add(e);
           }
       }


        return l1;
    }

    public Employee getTopPaidEmployee(){
        List<Employee> l1 = new ArrayList<>();
        for(Employee e:ls){
            l1.add(e);
        }
        l1.sort((s1,s2)->{
            if(s1.getSalary()!=s2.getSalary()){
                return Double.compare(s1.getSalary(),s2.getSalary());
            }
            return 0;
        });
        return l1.get(l1.size()-1);
    }
}
