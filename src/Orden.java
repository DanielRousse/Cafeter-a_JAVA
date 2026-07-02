import java.util.ArrayList;
import java.util.List;

public class Orden {
    private List<Producto> productos;

    public Orden() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        if (!producto.isDisponible()) {
            System.out.println("No es posible agregar este producto porque no está disponible.");
            return;
        }
        productos.add(producto);
        System.out.println("Producto agregado:");
        System.out.println(producto.getNombre());
        System.out.println();
    }

    public void mostrarOrden() {
        System.out.println("========== ORDEN ==========");
        for (Producto producto : productos) {
            String nombre = producto.getNombre();
            double precioFinal = producto.calcularPrecioFinal();
            int dotsCount = 22 - nombre.length();
            System.out.print(nombre + " ");
            for (int i = 0; i < dotsCount; i++) {
                System.out.print(".");
            }
            System.out.printf(" $%.2f\n", precioFinal);
        }
        System.out.println();
        System.out.println("Cantidad de productos: " + productos.size());
        System.out.println();
        double subtotal = calcularSubtotal();
        double iva = subtotal * 0.16;
        double total = subtotal + iva;
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA: $%.2f\n", iva);
        System.out.printf("Total: $%.2f\n", total);
    }

    private double calcularSubtotal() {
        double suma = 0.0;
        for (Producto producto : productos) {
            suma += producto.calcularPrecioFinal();
        }
        return suma;
    }
}
