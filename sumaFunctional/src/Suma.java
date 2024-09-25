import java.util.ArrayList;

public class Suma {

    static int counter = 0;

    public static int realizarSuma(int numero1, int numero2 ){
        return numero1 + numero2;
    }


    public static int realizarSumaFuncional(ArrayList numeros){
        for (int i =0; i < numeros.size(); i++){
            counter = counter + (int)numeros.get(i);
        }
        return counter;
    }

    public static int sumaPowPares(ArrayList pows){
        for (int i =0; i < pows.size(); i++){
            counter = counter + (int)pows.get(i);
        }
        return counter;
    }

}
