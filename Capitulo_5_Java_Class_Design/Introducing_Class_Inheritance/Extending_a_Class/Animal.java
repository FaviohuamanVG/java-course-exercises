public class Animal {
    /*
    Como una clase puede reutilizarse y extender su comportamiento
    de otra.
    */

    // Cuando una clase B se extiende al A, se dice que B es la subclase
    // de A mientras que A es la superclase. B obtiene acceso a todos 
    // los miembros public y protected de A, sin reescribir codigo.

    private int age; // Marcado como private, no puede ser accedido 
    // por nadie mas que la clase Animal.
    
    public int getAge(){ // Marcado como public pueden ser utilizados
    //  y hasta heredados y llamados por cualquier otra clase.
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
