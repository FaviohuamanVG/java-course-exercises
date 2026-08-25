package Applying_Access_Modifiers.Private_Access;

public class BadDuckling {
    public void makeNoise(){
        FatherDuck duck = new FatherDuck(); // Se crea una instancia de FatherDuck desde otra clase.
      //  duack.quack(); DOES NOT COMPILE.
        // duack es private y BadDuckling no es la misma clase que FatherDuck por eso el rechazo.
       // System.out.println(duck.noise); DOES NOT COMPILE.
    }
}
