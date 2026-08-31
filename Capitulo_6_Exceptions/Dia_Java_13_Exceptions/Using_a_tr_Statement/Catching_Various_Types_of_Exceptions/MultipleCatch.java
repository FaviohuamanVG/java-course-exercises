package Dia_Java_13_Exceptions.Using_a_tr_Statement.Catching_Various_Types_of_Exceptions;

public class MultipleCatch {
    /*
    Podemos utilizar multiples catch para capturar diferentes tipos de 
    excepciones, en tal caso tener muchos catch en un mismo try
    hara que el orden si importe.
    */

    public void visitMonkeys(){
        try{
            seeAnimal();
        }catch(ExhibitClosedForLunch e) {
            System.out.println("try back later");
        } catch(ExhibitClosed e){
            System.out.println("not day");

        }
    }

    /*
    Es un metodo con multiple try-catch a lo cual tiene el metodo seeAnimal
    ejecutandose en el try y lanzando una excepcion de tipo ExhibitClosedForLunch
    a lo cual se destruye el try y se ejecuta el catch e imprime try back later
    */

    public void visitPorcupine(){
        try{
            seeAnimal();
        }catch(ExhibitClosedForLunch e) {
            System.out.println("try back later");
        } catch(ExhibitClosed e){
            System.out.println("not day");

        }
    }

    /*
    El metodo visitPorcupine es igual al metodo visitMonkeys
    ambos ejecutan el metodo seeAnimal y lanzan la excepcion
    ExhibitClosedForLunch donde rompen el try y ejecutan el 
    catch correspondiente terminando el programa con la
    impresion de try back later
    */

    public void seeAnimal(){
        throw new ExhibitClosedForLunch();
    }

    public static void main(String[] args) {
        new MultipleCatch().visitMonkeys();
        System.out.println();
        new MultipleCatch().visitPorcupine();

        /*
        Llamamos a los metodos visitMonkeys y
        visitPorcupine para que se ejecuten y 
        lograr ver el funcionamiento de los
        multiples-catch, en ambos casos.
        */
    }


}

class AnimalsOutForAWalk extends RuntimeException{}
class ExhibitClosed  extends RuntimeException {}
class ExhibitClosedForLunch  extends ExhibitClosed {}

/*
Clases:
    AnimalsOutForAWalk: Excepcion de tipo RuntimeException
    ExhibitClosed: Excepcion de tipo RuntimeException
    ExhibitClosedForLunch: Excepcion de tipo ExhibitClosed
Estas clases son utilizadas para lanzar excepciones en el
metodo seeAnimal y ser capturadas en los metodos v
isitMonkeys y visitPorcupine.
*/
