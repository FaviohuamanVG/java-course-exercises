package Using_the_StringBuilder_Class.deletes;

public class Methods {
    /*  
    delete() es el opuesto de append, ya que elimina rango de caracteres
    Ambos modifican el objeto original
    */

    // StringBuilder delete(int start, int end) Elimina un rango de caracteres.
    // StringBuilder deleteCharAt(int index) Elimina un solo caracter, el que esta en esa posicion exacta.
    public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("abcdef");
            sb.delete(1, 3); // sb = adef
            // estamos eliminando el indice 1 y 3 - b,c
            sb.deleteCharAt(5); // throws an exception
            // nos da el error ya que el valor 5 ya no esta existiendo.
    }
}
