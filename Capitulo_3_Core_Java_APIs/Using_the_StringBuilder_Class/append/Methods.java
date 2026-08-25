package Using_the_StringBuilder_Class.append;

public class Methods {
    /*  
    Agrega el valor que le pases al final de StringBuilder y devuelve la referencia al mismo objeto
    */
   // StringBuilder append(String str)
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("animals");
        // StringBuilder con un valor "animals" 0-6
        sb.insert(7, "-"); // sb = animals-
        // estamos insertando el valor "-" al indice 7 por lo cual luego de s de la cadena animals
        sb.insert(0, "-"); // sb = -animals-
        // insertando "-" en el indice 0 de animals-
        sb.insert(4, "-"); // sb = -ani-mals-
        // insertando "-" en el indice 4 de -animals-
        System.out.println(sb);
    }
}
