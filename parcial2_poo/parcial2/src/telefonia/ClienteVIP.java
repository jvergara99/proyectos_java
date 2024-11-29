package telefonia;

public class ClienteVIP extends Cliente {

    final double PAGO_POR_MIN;

    public ClienteVIP(String name, String id, String telefono) {
        super(name, id, telefono);
        PAGO_POR_MIN = 0.14;
    }


    @Override
    public void emitirFactura(int numMinPorMes) {
        facturaMensual = PAGO_POR_MIN * numMinPorMes;
    }
}


