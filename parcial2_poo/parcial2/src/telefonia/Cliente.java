package telefonia;

public abstract class Cliente {
    private String name;
    private String id;
    private String telefono;
    public static int nClientes;
    public double facturaMensual = 0.0;

    public Cliente(String name, String id, String telefono) {
        this.name = name;
        this.id = id;
        this.telefono = telefono;
        this.nClientes++;
    }

    public abstract void emitirFactura( int numMinPorMes);
    public String getName() {
        return this.name;
    }
}
