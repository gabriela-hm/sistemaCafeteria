package parte2;

public class SistemaTurnos {
    public static void main(String[] args){
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};
        int inventarioBrownie = 10;
        int totalPedidosProcesados = 0;
        double totalRecaudado = 0.0;
        double mayorValorPedido = 0.0;
        int numeroPedidoMayor = 0;

        //Tarea4
        double montoApertura = -80000.0;
        do {
            System.out.println("Intentando registrar monto de apertura: $" + montoApertura);
            montoApertura = 100000.0;
        } while (montoApertura <= 0);
        System.out.println("Apertura exitosa: Monto registrado: $" + montoApertura + "\n");

        //Tarea1
        for(int i = 0; i < pedidoProducto.length; i++){
            int indice = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];
            String nombreProducto = nombres[indice];
            double precioUnitario = precios[indice];
            char letraCategoria = categorias[indice];

            //Tarea3
            if (indice == 4) {
                if (cantidad > inventarioBrownie) {
                    System.out.println("Pedido número: " + (i + 1));
                    System.out.println("Producto: " + nombreProducto);
                    System.out.println("Producto agotado: No hay suficiente inventario.");
                    continue;
                } else {
                    inventarioBrownie -= cantidad;
                }
            }

            double subtotal = precioUnitario * cantidad;

            String descripcionCategoria = "";
            switch (letraCategoria) {
                case 'B':
                    descripcionCategoria = "Bebida caliente";
                    break;
                case 'F':
                    descripcionCategoria = "Bebida fría";
                    break;
                case 'C':
                    descripcionCategoria = "Comida";
                    break;
                case 'P':
                    descripcionCategoria = "Postre";
                    break;
                default:
                    descripcionCategoria = "Desconocida";
                    break;
            }

            //Tarea2
            double totalFinal = subtotal;
            if (subtotal > 12000) {
                totalFinal = subtotal - (subtotal * 0.10);
                System.out.println("Descuento aplicado (10%)");
            } else {
                System.out.println("Sin descuento.");
            }

            System.out.println("Pedido número: " + (i + 1));
            System.out.println("Nombre del producto: " + nombreProducto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Categoría: " + descripcionCategoria);
            System.out.printf("Subtotal del pedido: $%.2f%n", subtotal);
            System.out.printf("Valor final a pagar: $%.2f%n", totalFinal);

            //Tarea5
            totalPedidosProcesados++;
            totalRecaudado += totalFinal;

            if (totalFinal > mayorValorPedido) {
                mayorValorPedido = totalFinal;
                numeroPedidoMayor = (i + 1);
            }
        }

        System.out.println("REPORTE DE CIERRE");
        System.out.println("Total de pedidos procesados: " + totalPedidosProcesados);
        System.out.printf("Total recaudado en el turno: $%.2f%n", totalRecaudado);
        System.out.println("Pedido con mayor valor: Pedido #" + numeroPedidoMayor + " (con un valor de $" + mayorValorPedido + ")");
        System.out.println("Inventario restante de Brownie: " + inventarioBrownie + " unidades.");
    }
}
