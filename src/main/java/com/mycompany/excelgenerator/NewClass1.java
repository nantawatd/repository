/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excelgenerator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;

/**
 *
 * @author Nantawat
 */
public class NewClass1 {

    public static void main(String[] args) throws IOException {
//        List<Employee> employees = generateSampleEmployeeData();
        
//        String srcFilePath  = "target/template.xls";
//        try (InputStream is = new FileInputStream(srcFilePath)) {
//            try (OutputStream os = new FileOutputStream("target/output.xls")) {
//                Context context = new Context();
//                context.putVar("employees", employees);
//                JxlsHelper.getInstance().processTemplate(is, os, context);
//            }
//        }
        
        Order order = new Order();
        order.setBillNumber("987654321");
        order.setCustomerName("Jumbo");
        order.setOrderDate("19/03/2017");
        order.setQuotationId("QU001");
        order.setReceiveDate("19/03/2017");
        order.setSellerName("Robert");

        String srcFilePath  = "target/complete.xls";
        try (InputStream is = new FileInputStream(srcFilePath)) {
            try (OutputStream os = new FileOutputStream("target/output_complete.xls")) {
                Context context = new Context();
                context.putVar("order", order);
                JxlsHelper.getInstance().processTemplate(is, os, context);
            }
        }
    }
    
    private static List<Employee> generateSampleEmployeeData() {
        List<Employee> employees = new ArrayList<>();
        
        Employee employee = new Employee();
        employee.setFirstName("Jumbo2");
        employee.setLastName("Dejcharoen2");
        
        Employee employee2 = new Employee();
        employee2.setFirstName("Marco2");
        employee2.setLastName("Maxis2");
        
        employees.add(employee);
        employees.add(employee2);
        
        return employees;
    }
}
