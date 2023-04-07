package question3;

import java.util.ArrayList;

import question3.entities.FaturamentoDia;

public class Main {
	public static void main(String[] args) {

		ArrayList<FaturamentoDia> faturamento = new ArrayList<FaturamentoDia>();
		faturamento.add(new FaturamentoDia(1, 22174.1664));
		faturamento.add(new FaturamentoDia(2, 24537.6698));
		faturamento.add(new FaturamentoDia(3, 26139.6134));
		faturamento.add(new FaturamentoDia(4, 0.0));
		faturamento.add(new FaturamentoDia(5, 0.0));
		faturamento.add(new FaturamentoDia(6, 26742.6612));
		faturamento.add(new FaturamentoDia(7, 0.0));
		faturamento.add(new FaturamentoDia(8, 42889.2258));
		faturamento.add(new FaturamentoDia(9, 46251.174));
		faturamento.add(new FaturamentoDia(10, 11191.4722));
		faturamento.add(new FaturamentoDia(11, 0.0));
		faturamento.add(new FaturamentoDia(12, 0.0));
		faturamento.add(new FaturamentoDia(13, 3847.4823));
		faturamento.add(new FaturamentoDia(14, 373.7838));
		faturamento.add(new FaturamentoDia(15, 2659.7563));
		faturamento.add(new FaturamentoDia(16, 48924.2448));
		faturamento.add(new FaturamentoDia(17, 18419.2614));
		faturamento.add(new FaturamentoDia(18, 0.0));
		faturamento.add(new FaturamentoDia(19, 0.0));
		faturamento.add(new FaturamentoDia(20, 35240.1826));
		faturamento.add(new FaturamentoDia(21, 43829.1667));
		faturamento.add(new FaturamentoDia(22, 18235.6852));
		faturamento.add(new FaturamentoDia(23, 4355.0662));
		faturamento.add(new FaturamentoDia(24, 13327.1025));
		faturamento.add(new FaturamentoDia(25, 0.0));
		faturamento.add(new FaturamentoDia(26, 0.0));
		faturamento.add(new FaturamentoDia(27, 25681.8318));
		faturamento.add(new FaturamentoDia(28, 1718.1221));
		faturamento.add(new FaturamentoDia(29, 13220.495));
		faturamento.add(new FaturamentoDia(30, 8414.61));

		double totalFaturamento = 0.0;
		int numDiasFaturamentoMaiorQMedia = 0;
		double mediaMensal = 0.0;
		double menorValor = Double.MAX_VALUE;
		double maiorValor = Double.MIN_VALUE;


        for (FaturamentoDia dia : faturamento) {
            if (dia.getValor() == 0.0) {
                continue; 
            }

            if (dia.getValor() < menorValor) {
                menorValor = dia.getValor();
            }

            if (dia.getValor() > maiorValor) {
                maiorValor = dia.getValor();
            }

            totalFaturamento += dia.getValor();
        }

        mediaMensal = totalFaturamento / faturamento.size();
        
        for(FaturamentoDia dia : faturamento) {
        	if(dia.getValor() > mediaMensal) {
        		numDiasFaturamentoMaiorQMedia += 1;
        	}
        }
        
        System.out.println("Menor valor de faturamento ocorrido em um dia do m�s: " + menorValor);
        System.out.println("Maior valor de faturamento ocorrido em um dia do m�s: " + maiorValor);
        System.out.println("N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal: " + numDiasFaturamentoMaiorQMedia);
	}
}
