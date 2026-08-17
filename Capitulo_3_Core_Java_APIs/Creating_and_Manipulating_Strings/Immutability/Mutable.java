package Creating_and_Manipulating_Strings.Immutability;

public class Mutable {
    /* 
    Java permite llamara metodos sobre String que aparentemente
    lo modifican pero en realidad crean otro String.
    */
    private String s; // String privado
    public void setS(String newS) { // Se marco el setS como mutable
        s = newS; 
    }
    public String getS(){
        return s;
    }

    final class Inmutable {
        private String s = "name";
        public String getS(){
            return s;
        }
        
    }

    public static void main(String[] args) {
        String s1 = "1";
        String s2 = s1.concat("2"); //Guarda el nuevo valor
        s2.concat("3"); // no modifica el nuevo String
        System.out.println(s2); // Respuesta es 12
        /*
        Por que el s2 apunta a la concatenacion de s1 y s2
        s2.concat("3") <-- no estamos guardando la diferencia
        deberiamos realizar s2 = s2.concat("3");
        y alli recien tendriamos el resultado 123
        */
    }

}
