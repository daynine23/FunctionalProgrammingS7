import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int counter = 0;
    static int totalSuma = 0;
    public static void main(String[] args) {

        ArrayList listaNum = new ArrayList();
        listaNum.add(2);
        listaNum.add(4);
        listaNum.add(6);
        System.out.println("La suma es : " + Suma.realizarSumaFuncional(listaNum));


        List<Integer> numeros = crearListaNumeros();
        List<Integer> potenciasPares = convertirACuadrados(numeros);
        imprimirLista(potenciasPares);



    }

    public static List<Integer> crearListaNumeros() {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(100));
        }

        return lista;
    }

    public static List<Integer> obtenerPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();

        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        return pares;
    }

    public static List<Integer> convertirACuadrados(List<Integer> lista) {
        List<Integer> cuadrados = new ArrayList<>();

        for (int num : lista) {
            cuadrados.add(num * num);
        }

        return cuadrados;
    }

    public static void imprimirLista(List<Integer> Lista) {

        for (Integer i : Lista) {
            System.out.println(i);
        }



    }


    public static int sumaPowPares(List<Integer> pows){
        for (int i =0; i < pows.size(); i++){
            counter = counter + (int)pows.get(i);
        }
        return counter;
    }
}