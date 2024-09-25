package v2_superfunciones_clases;

import v2_superfunciones_clases.interfaces.Predicado;
import v2_superfunciones_clases.interfaces.Proveedor;

import java.util.ArrayList;
import java.util.List;

public class SuperFunciones {

    public static List<Integer> proveer(int size, Proveedor proveedor){
        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < size; i++){
            resultado.add(proveedor.obtener());
        }

        return resultado;
    }

    public static List<Integer> filtrar(List<Integer> numeros, Predicado predicado){
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero:numeros){
            if(predicado.test(numero)){
                resultado.add(numero);
            }
        }

        return resultado;
    }
}
