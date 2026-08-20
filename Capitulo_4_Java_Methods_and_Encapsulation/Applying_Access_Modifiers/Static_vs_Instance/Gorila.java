package Applying_Access_Modifiers.Static_vs_Instance;

public class Gorila {
    public static int count;

    public static void addGorilla(){
        count++; 
    }

    public void babyGorilla(){ 
        count++;
    }
    
    public void announceBabies(){
         addGorilla();
         babyGorilla();
    }
    public static void announceBabiesToEveryone(){ // Metodo Static
        addGorilla();
    //    babyGorilla();  DOES NOT COMPILE
        // Intenta llamar a babyGorilla() el cual es un metodo de instancia
        // no puede ser llamado.
    }
    public int total;
    // public static int average = total / count; // DOES NOT COMPILE
}
