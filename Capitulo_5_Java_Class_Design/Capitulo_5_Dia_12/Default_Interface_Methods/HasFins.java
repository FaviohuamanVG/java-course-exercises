package Capitulo_5_Dia_12.Default_Interface_Methods;

public interface HasFins {
    public default int getNumberOfFins(){
        return 6;
    }

    public default double  getLongestFinLength(){
        return 6.0;
    }

    public default boolean doFinsHaveScales(){
        return true;
    }

    /*
    Declaramos 3 metodos default, que tienen un cuerpo y que estos pueden ser heredados y sobreescritos
    ademas que tienen un cuerpo al cual retornan un valor segun el tipo de dato que es.
    Y compila porque son public y no tienen modificadores que choquen con default.
    */
}
