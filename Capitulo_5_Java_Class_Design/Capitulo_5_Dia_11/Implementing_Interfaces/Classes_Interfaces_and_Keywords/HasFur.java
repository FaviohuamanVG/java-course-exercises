package Implementing_Interfaces.Classes_Interfaces_and_Keywords;

public interface HasFur extends /*Hyena*/ CanRun { // DOES NOT COMPILE
    // Una interfaz solo puede extender de otras interfaces; jamás de una clase 
    // (ni siquiera de java.lang.Object). 

    public static void main(String[] args) {
        System.out.println("Clases, interfaces y keywords");
        System.out.println("Solo interfaces pueden extender otras interfaces.");
    }
} 
