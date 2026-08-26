package Capitulo_5_Dia_12.Understanding_Polymorphism.Casting_Objects;

public class Capybara extends Rodent {
   public static void main(String[] args) {
      Rodent rodent = new Rodent();
      Capybara capybara = (Capybara)rodent; // ClassCastException en runtime
   }
   
   /*
   Se crea un objeto especificamente en Rodent y no en Capybara. Linea 5.
   - Capybara capybara = (Capybara)rodent;
   Java permite el cast pq hay una relacion jerarquica entre las clases: Capybara extends Rodent en
   pocas palabras es un downcasting legítimo, pero al ejecutar el programa se lanza un error de 
   ClassCastException pq Java revisa el objeto real y es Rodent mas no un Capybara.
   // No cumple con la condicion y lanza ese error.
   */

   /*
   if (rodent instanceof Capybara) { Capybara capybara = (Capybara)rodent; }
   Usar instanceof antes de castear previene ese exception, solo se ejecuta si
   el cast es un objeto de (o heredado de) Capybara, en tal caso si es Rodent, 
   simplemente no se ejecuta y no hay exception.
   */

}