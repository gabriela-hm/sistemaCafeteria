package parte1;

public class E1Variables {
    public static void main(String[] args){
        String nombreProducto = "Té de Manzanilla";
        double precioUnitario = 5.5;
        int cantidadInventario = 20;
        boolean disponibleHoy = true;
        char codigoProducto = 'T';

        String datos = String.format(
                "DETALLES DEL PRODUCTO \n" +
                        "Nombre: %s\n" +
                        "Precio: $%.3f\n " +
                        "Stock: %d unidades\n " +
                        "Código: %c\n" +
                        "¿Disponible Hoy?: %b",

                        nombreProducto,
                        precioUnitario,
                        cantidadInventario,
                        codigoProducto,
                        disponibleHoy
        );
        System.out.println(datos);
    }
}
