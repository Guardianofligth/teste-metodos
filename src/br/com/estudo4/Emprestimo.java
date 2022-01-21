package br.com.estudo4;

public class Emprestimo {


    public static int getDuasparcelas() {
        return 2;
    }

    public static int getTresparcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.4;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        }else if (parcelas == 3){

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        }else{
            System.out.println("Quantidade de parcelas não aceita.");

        }
    }
}
