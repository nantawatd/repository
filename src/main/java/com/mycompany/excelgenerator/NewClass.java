/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excelgenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jxls.template.SimpleExporter;

/**
 *
 * @author Nantawat
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Test");
        
        try (OutputStream os1 = new FileOutputStream("target/simple_export_output1.xls")) {
            List<Employee> employees = generateSampleEmployeeData();
            List<String> headers = Arrays.asList("Name", "Lastname");
            SimpleExporter exporter = new SimpleExporter();
            exporter.gridExport(headers, employees, "firstName, lastName", os1);
        }
        
    }
    private static List<Employee> generateSampleEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        
        Employee employee = new Employee();
        employee.setFirstName("Jumbo");
        employee.setLastName("Dejcharoen");
        
        Employee employee2 = new Employee();
        employee2.setFirstName("Marco");
        employee2.setLastName("Maxis");
        
        employees.add(employee);
        employees.add(employee2);
        
        return employees;
    }
}
