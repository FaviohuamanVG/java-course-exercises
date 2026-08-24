package Introducing_Class_Inheritance.Redeclaring_private_Methods;

public class BactrianCamel extends Camel {
    private int getNumberOfHumps() {
      return 2;
   }

   public static void main(String[] args) {
        BactrianCamel myBactrianCamel = new BactrianCamel();
        System.out.println(myBactrianCamel.getNumberOfHumps());
   }
}
