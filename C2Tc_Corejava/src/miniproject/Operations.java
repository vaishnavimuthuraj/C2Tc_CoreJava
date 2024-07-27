package miniproject;

import java.sql.*;
import java.util.*;
public class Operations
{

static Scanner sc=new Scanner(System.in);
public  static void insert() throws Exception
{
System.out.println("INSERTING");
System.out.println("Enter employee id:");
int emp_id=sc.nextInt();
System.out.println("Enter employee name:");
String emp_name=sc.next();
System.out.println("Enter employee location:");
String emp_loc=sc.next();
System.out.println("Enter employee designation:");
String emp_desig=sc.next();
System.out.println("Enter employee salary:");
double sal=sc.nextDouble();
Connection cc= JDBCDemo.getConnection();
Statement st=cc.createStatement();
String q="insert into employees values(?,?,?,?,?);";
PreparedStatement ps=cc.prepareStatement(q);
ps.setInt(1, emp_id);
ps.setString(2,emp_name);
ps.setString(3,emp_loc);
ps.setString(4,emp_desig);
ps.setDouble(5,sal);
int r=ps.executeUpdate();
if(r==1)
System.out.println("rows affected");
else
System.out.println("Not affected");
}
public static void delete() throws Exception
{
System.out.println("Enter employee id");
int del=sc.nextInt();
Connection cc=JDBCDemo.getConnection();
String q="delete from employees where id=?;";
PreparedStatement ps=cc.prepareStatement(q);
ps.setInt(1,del);
int r=ps.executeUpdate();
if(r==1)
System.out.println("row was deleted");
else
System.out.println("Not deleted");


}
public static void  update() throws Exception
{
System.out.println("What do you want to change?");
String change=sc.nextLine();

}
public  static void show() throws Exception
{
Connection cc=JDBCDemo.getConnection();
String q="select * from employees;";
Statement st=cc.createStatement();
ResultSet rs=st.executeQuery(q);
while(rs.next())
{
System.out.println("Emp_Id"+rs.getInt(1));
System.out.println("Emp_name"+rs.getString(2));
System.out.println("Emp_location"+rs.getString(3));
System.out.println("Emp_designation"+rs.getString(4));
System.out.println("salary"+rs.getDouble(5));
System.out.println();
}
}
  }


