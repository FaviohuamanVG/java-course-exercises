package Working_with_Varargs;

public class VarArgs {
    /*
    VarArgs: Variable argumentable, permite a un metodo aceptar 0, 1 o multiples argumentos.
    - El ultimo parametro puede ser un varargs
    - Solo un varargs por metodo: Consecuencia directa de la ultima posicion. Y solo puede haber una
    -- ultima posicion.
    */

    // Declaracion:
    public void walk1(int... nums){
        // Unico parametro, varargs.
    }

    public void walk2(int start, int... nums){
        // Parametro fijo start, num es un vararg y es el ultimo parametro.
    }

    /*public void walk3(int... nums, int start){ // DOES NOT COMPILE,
        // varargs esta en primera posicion, start Parametro fijo en la ultima.
    } */

    /*public void walk4(int... start, int... nums){ // DOES NOT COMPILE
        // solo puede haber un varargs por metodo. start no esta en la ultima posicion
        // Razones suficientes para no compilar.
    } */

    public static void walk4(int start, int... nums){
        System.out.println(nums.length);
    }

    public static void run(int... nums){
        System.out.println(nums[1]);
    }

    public static void main(String[] args) {
        walk4(1); // 0
        walk4(1, 2); // 1
        walk4(1, 2, 3); // 2
        walk4(1, new int[] {4, 5}); // 2
       // walk4(1, null);  throws a NullPointerException.

        // run varargs - acceso x indice.
        run(11, 22); //22
    }


}
