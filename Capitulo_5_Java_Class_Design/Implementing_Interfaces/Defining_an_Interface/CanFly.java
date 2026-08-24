package Implementing_Interfaces.Defining_an_Interface;

public interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();

    // Lo que se interpreta e inyecta el compilador internamente:
    /*
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();    
    */

   // El compilador agrega abstract a la definición de la interfaz.

   public static void main(String[] args) {
       System.out.println("Inyectando abstract a la definicion de la interfaz");
   }
}
