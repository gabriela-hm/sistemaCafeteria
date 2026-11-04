package parte1;

public class E5DoWhile {
    public static void main (String[] args){
        double montoApertura = -10000.0;
        int intento = 1;
        System.out.println("APERTURA DE CAJA");

        do {
            System.out.println("Intento " + intento + ": Ingresando monto de apertura de $" + montoApertura);
            if (montoApertura <= 0){
                System.out.println("Hubo un ERROR: El monto debe ser mayor a $0.\n Ingresaste: $ " + montoApertura + " Intente nuevamente.\n");
                montoApertura = 10000.0;
                intento++;
            }
        } while (montoApertura <= 0);
        System.out.println("¡Apertura de caja exitosa! Monto registrado: $" + montoApertura);
    }
}
