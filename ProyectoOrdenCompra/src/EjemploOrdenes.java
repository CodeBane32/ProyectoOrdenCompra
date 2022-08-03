public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra[] ordenes = new OrdenCompra[3];
        int indiceProducto;


        //orden 1
        OrdenCompra orden1 = new OrdenCompra("Productos de jardin");
        orden1.setCliente(new Cliente("David", "Valero"));

        orden1.addProducto(new Producto("MiTio", "Mesa de campo", 15));
        orden1.addProducto(new Producto("MiTio", "Rastrillo de madera", 10));
        orden1.addProducto(new Producto("MiAbuelo", "Azada de metal", 20));
        orden1.addProducto(new Producto("BestMowners", "Cortacesped Revolution", 230));
        ordenes[0]=orden1;

        //orden 2
        OrdenCompra orden2 = new OrdenCompra("Productos de fiesta de cumple");
        orden2.setCliente(new Cliente("Esteban", "Malaga"));

        orden2.addProducto(new Producto("CumplesDe10", "Tarta de cumple", 15));
        orden2.addProducto(new Producto("Cumplesde10", "velasde10", 2));
        orden2.addProducto(new Producto("Cumplesde10", "Gorros de fiesta", 2));
        orden2.addProducto(new Producto("Cumplesde10", "Payasos de fiesta", 150));
        ordenes[1]=orden2;

        //orden 3
        OrdenCompra orden3 = new OrdenCompra("Piezas del coche");
        orden3.setCliente(new Cliente("Jarabe", "Depalo"));

        orden3.addProducto(new Producto("Michelin", "Rueda de repuesto", 30));
        orden3.addProducto(new Producto("Mercedes", "Liquido anticongelante", 15));
        orden3.addProducto(new Producto("Mercedes", "Recambio parabrisas", 80));
        orden3.addProducto(new Producto("Repsol", "Galon de gasolina", 10));
        ordenes[2] = orden3;


        for (OrdenCompra orden : ordenes) { //orden es cada orden
            System.out.println();
            System.out.println("Cliente: " + orden.getCliente().datosCliente());
            for (int i = 0; i < orden1.getProductos().length; i++) {
                System.out.println();
                System.out.println("Producto " + (i+1) + ": ");
                System.out.println("Nombre: " + orden.getProductos()[i].getNombre());
                System.out.println("Fabricante: " + orden.getProductos()[i].getFabricante());
                System.out.println("Precio: " + orden.getProductos()[i].getPrecio() + " euros");
            }
            System.out.println("Precio total de la orden: " + orden.granTotal() + " euros");
            System.out.println("//////////////////////////////////////////");
        }


    }
}
