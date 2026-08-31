package Using_the_StringBuilder_Class.stringbuilder_stringbuffer;

public class Methods {
    /*  
    Ambas clases hacen lo mismo: representan una secuencia de caracteres mutable, 
    con prácticamente los mismos métodos (append(), insert(), delete(), reverse(), etc.).
    */
   public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Java");
    StringBuilder ref = sb.append(" Rocks");
    sb.insert(0, ">> ");
    ref.reverse();
    String result = sb.toString();
    System.out.println("sb=" + sb);
    System.out.println("ref=" + ref);
    System.out.println("result=" + result);
   }
}
