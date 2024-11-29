import telefonia.*;

public class JavaLIS {
    public static void main(String[] args) {
        Cliente[] clientes = {new ClienteVIP("Liz", "20245", "1234" ), new ClienteNormal("Luzio", "20246", "5678")};

        clientes[0].emitirFactura(50);
        clientes[1].emitirFactura(60);

        System.out.println("Facturas de nov. 2024\nNo. Nombre\tPago");

        for (int i = 0; i < Cliente.nClientes; i++) {
            System.out.println((i+1) + " " + clientes[i].getName() + "\t" + clientes[i].facturaMensual );
        }
    }
}




