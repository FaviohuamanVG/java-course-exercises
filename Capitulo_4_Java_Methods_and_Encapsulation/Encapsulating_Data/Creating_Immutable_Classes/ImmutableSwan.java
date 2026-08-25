package Encapsulating_Data.Creating_Immutable_Classes;
    /*
    Encapsulamiento (Proteger como se modifica el estado).
    Inmutabilidad (Impedir que el estado sea modificado después de la creación del objeto).
    */
public class ImmutableSwan {
    // Inmutable simple:
    private int numberEggs; // private
    public ImmutableSwan(int numberEggs){
        this.numberEggs = numberEggs;
    }    
    // Sin campos Inmutables, no hay setters, solo getters.

    public int getNumberEggs(){
        return numberEggs;
    }

}
