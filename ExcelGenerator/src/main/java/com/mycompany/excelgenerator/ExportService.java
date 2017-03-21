/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excelgenerator;

import com.mycompany.excelgenerator.dto.Employee;
import com.mycompany.excelgenerator.dto.Order;
import com.mycompany.excelgenerator.dto.Net;
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
public class ExportService {

    public static void main(String[] args) throws IOException {
        Order order = new Order();
        order.setBillNumber("987654321");
        order.setCustomerName("Jumbo");
        order.setOrderDate("19/03/2017");
        order.setQuotationId("QU001");
        order.setReceiveDate("19/03/2017");
        order.setSellerName("Robert");

        List<Net> nets = generateSampleNetData();
        
        String srcFilePath  = "target/complete.xls";
        try (InputStream is = new FileInputStream(srcFilePath)) {
            try (OutputStream os = new FileOutputStream("target/output_complete.xls")) {
                Context context = new Context();
                context.putVar("order", order);
                context.putVar("nets", nets);
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
    
    private static List<Net> generateSampleNetData() {
    	  List<Net> nets = new ArrayList<>();
    	  
    	  Net net = new Net();
    	  net.setHeight("2010");
    	  net.setWide("826");
    	  
    	  Net net2 = new Net();
    	  net2.setHeight("500");
    	  net2.setWide("1652");
    	  
    	  nets.add(net);
    	  nets.add(net2);
    	  
    	  return nets;
    }
}
