public class Department{
 static String departmentName = "HR";
  String employeeName;
   
   public static void main(String[] args){
   System.out.println("departmentName:" + Department.departmentName);
   Department d1= new Department();
   d1.employeeName = "john";
   Department d2= new Department();
   d2.employeeName = "Alice";
   System.out.println("Employee 1: "+ d1.employeeName);
   System.out.println("Employee 2: "+ d2.employeeName);

   Department.departmentName= "Marketing";

   System.out.println("\nAfter modification:");
   System.out.println("departmentName:" + Department.departmentName);
   
}
}





