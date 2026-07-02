public class Main {
    public static void main(String[] args) {
        Bebida cafeAmericano = new Bebida("Café Americano", 40.0, true, "Medium", false);
        Bebida capuccino = new Bebida("Capuccino", 55.0, true, "Large", false);
        Bebida teVerde = new Bebida("Té Verde", 35.0, true, "Small", true);

        Alimento sandwich = new Alimento("Sandwich", 95.0, true, false, 350);
        Alimento muffin = new Alimento("Muffin", 50.0, true, true, 250);
        Alimento ensalada = new Alimento("Ensalada", 80.0, true, true, 150);

        Bebida cafeAgotado = new Bebida("Café Espresso", 30.0, false, "Small", false);

        Menu menu = new Menu();
        menu.agregarProducto(cafeAmericano);
        menu.agregarProducto(capuccino);
        menu.agregarProducto(teVerde);
        menu.agregarProducto(sandwich);
        menu.agregarProducto(muffin);
        menu.agregarProducto(ensalada);

        menu.mostrarMenu();

        Orden orden = new Orden();
        orden.agregarProducto(capuccino);
        orden.agregarProducto(sandwich);
        orden.agregarProducto(muffin);
        orden.agregarProducto(cafeAgotado);

        orden.mostrarOrden();
    }
}
