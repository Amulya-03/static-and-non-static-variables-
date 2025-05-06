public class Computer{
 static String os = "Windows";
  String ram;
   
   public static void main(String[] args){
   System.out.println("OS:" + Computer.os);
   Computer c1= new Computer();
   c1.ram = "8GB";
   Computer c2= new Computer();
   c2.ram = "16GB";

   System.out.println("RAM 1 : "+ c1.ram);
   System.out.println("RAM 2: "+ c2.ram);
}
}

