package v2_superfunciones_clases;

import v2_superfunciones_clases.interfaces.Proveedor;

public class Aleatorio implements Proveedor {
    @Override
    public Integer obtener() {
        return (int)(Math.random()*100+1);
    }
}
