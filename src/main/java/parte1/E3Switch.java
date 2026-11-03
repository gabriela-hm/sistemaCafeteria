package parte1;

public class E3Switch {
    public static void main(String[] args){
        char categoria = 'P';
        switch (categoria){
            case 'B':
                System.out.println("Bebida Caliente");
                System.out.println("IVA: 0%");
                break;

            case 'F':
                System.out.println("Bebida Fría");
                System.out.println("IVA: 5%");
                break;

            case 'C':
                System.out.println("Comida");
                System.out.println("IVA: 8%");
                break;

            case 'P':
                System.out.println("Postres");
                System.out.println("IVA: 8%");
                break;
            default:
                System.out.println("Caracter no reconocido: Categoría inválida.");
                break;
        }
    }
}
