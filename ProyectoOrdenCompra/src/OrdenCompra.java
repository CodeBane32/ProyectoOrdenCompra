import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private final String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }



    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "cliente=" + cliente +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }



    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public void addProducto (Producto producto){
        if(identificador < this.productos.length) {
            this.productos[identificador++] = producto;
        }
    };

    public int granTotal(){
        int suma = 0;
        for (Producto producto : this.productos) {
            suma += producto.getPrecio();
        }
        return suma;
    }




}
