package Applying_Access_Modifiers.Static_vs_Instance;

public class Counter {
    private static int count;
    public Counter() { 
        count++; 
    }
    
    public static void main(String[] args) {
        // Cada vez que se ejecuta new Counter(), se llama al constructor de instancia
        // por lo cual incrementa la variable global count
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // Imprime 3
    }
}
