public class Lion extends Animal {

    /* Lion puede acceder a los metodos de la clase Animal,
    ya que estos estan marcados como public por los cual tienen
    acceso. Pero no puede acceder a los atributos. */

    private void roar(){
        System.out.println("The "+getAge() + " year old lion says: Roar!");
    }

    /* 
    private void roar1(){
        System.out.println("The "+age+ " year old lion says: Roar!");
    }
    */

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.roar();
    }
}
