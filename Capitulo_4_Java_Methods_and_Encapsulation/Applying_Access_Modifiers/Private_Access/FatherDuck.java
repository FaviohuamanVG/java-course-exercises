package Applying_Access_Modifiers.Private_Access;

public class FatherDuck{
    /*  
    Con private access, solo el codigo escrito dentro de la misma clase y ese mismo archivo .java
    puede acceder a ese metodo o acceder a ese campo.
    Ni siquiera una clase en el mismo paquete tiene permiso.
    */
    // Declara un campo de instancia marcado como privado
    private String noise = "Quack";

    // Declara un metodo private. Solo invocable en la misma clase y archivo .java
    private void quack(){
        System.out.println(noise); // Se puede acceder al campo privado pq esta dentro de la misma clase.
    }

    private void makeNoise(){ // Metodo private de la misma clase.
        quack(); // Invocamos a quack() 
        // private no impide que los miembros se usen entre si dentro de la misma clase.
    }

    public static void main(String[] args) {
        FatherDuck fatherDuck = new FatherDuck();
        fatherDuck.makeNoise(); // Invocamos a makeNoise() que es private, pero estamos dentro de la misma clase.
        System.out.println("BadDuckling no puede acceder a los miembros de FatherDuck pq son private");
    }
}
