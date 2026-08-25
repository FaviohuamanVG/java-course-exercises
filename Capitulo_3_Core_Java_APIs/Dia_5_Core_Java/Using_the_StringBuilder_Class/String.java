package Using_the_StringBuilder_Class;

public class String {
    /*  
        String Builder: String es muy ineficiente para muchos cambios.
        10: String alpha = "";
        11: for(char current = 'a'; current <= 'z'; current++)
        12: alpha += current;
        13: System.out.println(alpha);
        // Java no esta almacenando o agreando algo nuevo, esta creando Strings completamente nuevo
    */
    public static void main(String[] args) {
        StringBuilder alpha = new StringBuilder();
        // StringBuilder no es inmutable. Se puede modificar directamente, sin crear un objeto nuevo.
        for(char current = 'a'; current <= 'z'; current++){
            alpha.append(current); // modifica el mismo objeto StringBuilder una y otra vez en cada vuelta.
            System.out.println(alpha);
        }

    }
    
}
