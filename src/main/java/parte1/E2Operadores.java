package parte1;

public class E2Operadores {
    public static void main(String[] args){
        double subtotal = 42500.0;
        double aplicaDescuento = 30000.0;
        double porcentajeDescuento = 0.15;

        boolean derechoDescuento = subtotal > aplicaDescuento;
        double descuento = derechoDescuento ? (subtotal * porcentajeDescuento) : 0.0;
        double totalAPagar = subtotal - descuento;

        System.out.printf("RESUMEN DE COMPRA \n");
        System.out.printf("¿Aplica descuento del 15%%?: %b\n", aplicaDescuento);
        System.out.printf("Valor del descuento: $%.2f\n", descuento);
        System.out.printf("Total a pagar: $%.2f\n", totalAPagar);
    }
}
