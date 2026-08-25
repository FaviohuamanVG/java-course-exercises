package Creating_and_Manipulating_Strings.The_important_String_Methods.indexOf;

public class IndexOf {
    /*
    indexOf() -- Es un poco mas flexible que charAt()
    "buscame donde aparece esto" - En lugar de que te diga que caracter hay
    le das un caracter o texto y te dice donde aparece por 1era vez.
    */

    public static void main(String[] args) {
    String string = "animals";
    System.out.println(string.indexOf('a')); // 0
    System.out.println(string.indexOf("al")); // 4
    System.out.println(string.indexOf('a', 4)); // 4
    System.out.println(string.indexOf("al", 5)); // -1
    }

}
