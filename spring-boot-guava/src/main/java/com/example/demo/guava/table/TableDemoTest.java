package com.example.demo.guava.table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：Table类似多个索引的表，类似 Map<R, Map<C, V>> 的数据结构。
 *     它有两个支持所有类型的键：”行”和”列”，可以通过以下方法获取多个视图：
 *
 *     rowMap()：用Map<R, Map<C, V>>表现Table<R, C, V>。同样的， rowKeySet()返回”行”的集合Set。
 *     row(r)：用Map<C, V>返回给定”行”的所有列，对这个map进行的写操作也将写入Table中。
 *     cellSet()：用元素类型为Table.Cell的Set表现Table<R, C, V>。Cell类似于Map.Entry，但它是用行和列两个键区分的。
 *
 * @author: 张小菜
 * @date: 2021/11/14 23:01
 * @version: v1.0
 */
public class TableDemoTest {

    @Test
    public void   test(){

        //create a table
        Table<String, String, String> employeeTable = HashBasedTable.create();

        //initialize the table with employee details
        employeeTable.put("IBM", "101","Mahesh");
        employeeTable.put("IBM", "102","Ramesh");
        employeeTable.put("IBM", "103","Suresh");

        employeeTable.put("Microsoft", "111","Sohan");
        employeeTable.put("Microsoft", "112","Mohan");
        employeeTable.put("Microsoft", "113","Rohan");

        employeeTable.put("TCS", "121","Ram");
        employeeTable.put("TCS", "102","Shyam");
        employeeTable.put("TCS", "123","Sunil");

        //所有行数据
        System.out.println(employeeTable.cellSet());
        //所有公司
        System.out.println(employeeTable.rowKeySet());
        //所有员工编号
        System.out.println(employeeTable.columnKeySet());
        //所有员工名称
        System.out.println(employeeTable.values());
        //公司中的所有员工和员工编号
        System.out.println(employeeTable.rowMap());
        //员工编号对应的公司和员工名称
        System.out.println(employeeTable.columnMap());
        //row+column对应的value
        System.out.println(employeeTable.get("IBM","101"));
        //IBM公司中所有信息
        Map<String,String> ibmEmployees =  employeeTable.row("IBM");

        System.out.println("List of IBM Employees");
        for(Map.Entry<String, String> entry : ibmEmployees.entrySet()){
            System.out.println("Emp Id: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //table中所有的不重复的key
        Set<String> employers = employeeTable.rowKeySet();
        System.out.print("Employers: ");
        for(String employer: employers){
            System.out.print(employer + " ");
        }
        System.out.println();

        //得到员工编号为102的所有公司和姓名
        Map<String,String> EmployerMap =  employeeTable.column("102");
        for(Map.Entry<String, String> entry : EmployerMap.entrySet()){
            System.out.println("Employer: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
