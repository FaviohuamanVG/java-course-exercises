public class Access {
    /*  
        Reconocer la estructura completa de un método en Java
        los modificadores de acceso:
        public: Accesible desde cualquier clase.
        private: Accesible solo dentro de la clase definida.
        protected: Mismo paquete o subclase.
        default: Sin nada, solo clases del mismo paquete.
    */

        public void walk1(){ // Metodo publico
            System.out.println("Walk1");
        } // accesible desde cualquier clase.

        /* default void walk2(){ // Metodo default
            System.out.println("Walk2");
        } // Al no ser un modificador de acceso no compilara.
        // Solo se usa en interfaces o switch case.
        */
        
        /*void public walk3(){ // Error de orden
            System.out.println("Walk3");
        } // Void no puede ser un tipo de retorno que inicie el metodo
        //  Siempre va el modificador primero y luego el retorno.
        */

        void walk4(){ // Metodo sin modificador
            System.out.println("Walk4");
        } // Por lo general es default o el mismo paquete.
        // No es recomendable pero COMPILA.

        public static void main(String[] args) {
            Access access = new Access();
            access.walk1();
            access.walk4();
        }
}
