package telefonia;

public class ClienteNormal extends Cliente {

    final double PAGO_POR_MIN;
    
    public ClienteNormal(String name, String id, String telefono) {
        super(name, id, telefono);
        PAGO_POR_MIN = 0.25;
    }

    @Override
    public void emitirFactura(int numMinPorMes) {
        facturaMensual = PAGO_POR_MIN * numMinPorMes;
    }
    
}
