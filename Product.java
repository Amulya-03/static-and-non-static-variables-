public class Product{
  static String category = "Electronics";
   String productName;
 
public static void main(String[] args){
System.out.println("category: "+ Product.category);
  Product product1 = new Product();
  product1.productName = "Laptop";
  Product product2 = new Product();
  product2.productName = "Smart Phone";
  System.out.println("product1: "+product1.productName);
  System.out.println("product2: "+product2.productName);
}
}



  
