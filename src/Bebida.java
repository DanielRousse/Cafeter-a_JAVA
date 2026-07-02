public class Bebida extends Producto implements Vendible {
    private String tamanio;
    private String temperatura;


    public Bebida(String nombre, double precio, boolean disponible, String tamanio, String temperatura) {
        super(nombre, precio, disponible);
        this.tamanio = tamanio;
        this.temperatura = temperatura;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = getPrecio();

        if (tamanio.equalsIgnoreCase("Large")) {
            precioFinal += 15;
        }

        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Temperatura: " + temperatura);
    }
}