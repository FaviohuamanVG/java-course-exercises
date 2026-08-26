package Capitulo_5_Dia_12.Default_Interface_Methods;

public interface IsWarmBlooded {
    /*
    Una interfaz puede tener metodos con cuerpo llamados metodos default, rompiendo la idea de que un 
    metodo de interfaz es abstracto.

    default:
        - Se declara con palabras clave default.
        - Tiene cuerpo (implementacion).
        - Las clases implementadas puede usarlo tal cual o sobreescribirlo, pero no estan obligadas
        a hacerlo.
    
    - default no puede declararse en una clase o en un clase abstracta, solo en una interfaz.
    - al usar default, debe tener obligatoriamente un cuerpo, si no tiene no compila.
    - default no usa modificadores static, abstract o final, ya que necesita ser heredado y sobreescrito.
    - siempre es public, marcarlo como private o protected no compila.
    */

    boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }

    /*
    Declaramos un metodo default, que tiene un cuerpo y que este puede ser heredado y sobreescrito
    ademas que compula por que es public y no tiene modificadores que choquen con default.
    */

}
