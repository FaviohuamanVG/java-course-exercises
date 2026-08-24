package Implementing_Interfaces.Defining_an_Interface;

public /*final*/ interface CanCrawl { // DOES NOT COMPILE
    
    /*
    private void dig(int depth); // DOES NOT COMPILE
    protected abstract double depth(); // DOES NOT COMPILE
    public final void surface(); // DOES NOT COMPILE
    */
    // final choca con abstract asumido, choca con los accesos public o default requerido en las interfaces.
    public static void main(String[] args) {
        System.out.println("Violación total de los modificadores implícitos");
    }
}
