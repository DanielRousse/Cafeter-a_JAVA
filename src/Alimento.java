public class Alimento extends Producto implements Vendible {
    private boolean vegetariano;
    private int calorias;

    public Alimento(String nombre, double precio, boolean disponible, boolean vegetariano, int calorias) {
        super(nombre, precio, disponible);
        this.vegetariano = vegetariano;
        this.calorias = calorias;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public int getCalorias() {
        return calorias;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getPrecio();

        if (vegetariano) {
            precioFinal *= 0.90;
        }

        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vegetariano: " + vegetariano);
        System.out.println("Calorías: " + calorias);
    }
}
