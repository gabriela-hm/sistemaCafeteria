package parte1;

public class E4While {
    public static  void main (String[] args){
        int unidades = 50;
        int consumoFijo = 3;

        while (unidades >= 10){
            unidades -= consumoFijo;
            System.out.println("Se agregó un pedido de " + consumoFijo + " unidades. Inventario restante " + unidades);
        }
    }
}
