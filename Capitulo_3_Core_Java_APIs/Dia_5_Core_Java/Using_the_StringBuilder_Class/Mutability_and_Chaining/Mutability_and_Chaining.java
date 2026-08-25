package Using_the_StringBuilder_Class.Mutability_and_Chaining;

public class Mutability_and_Chaining {
    /*
    Cada metodo modifica el objeto original y devuelve una referencia al mismo objeto(no uno nuevo).
    //En cada encadenamiento de StringBuilder solo existe uno solo en memoria, no se crea otro nuevo.
    */

    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder("start");
        // se modifica sb directamente. Y devuelve una referencia a sb pero se ignora el valor de retorno
        sb.append("+middle"); // sb = "start+middle"
        // vuelve a modificar el sb. Ahora sb y same apuntan al mismo objeto en memoria.
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        // No son copias, son 2 nombres distintos pero en la misma caja
        */

        StringBuilder a = new StringBuilder("abc"); // crea un StringB. apuntando a la a <--
        StringBuilder b = a.append("de"); // ahora vale abdcde, asi mismo a y b apuntan al mismo objeto
        b = b.append("f").append("g"); // se vuelve a modificar y se reasigna a b pero ya apuntaba a ese objeto
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        // como a y b apuntaban al mismo objeto entonces tendran los mismo valores.

    }
}
