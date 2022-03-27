package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class GerandoDataParcelas {

	public static void main(String[] args) throws ParseException {
		
		String dataInicial = JOptionPane.showInputDialog("Informe a data inicial da parcela: ");
		String vlcompra = JOptionPane.showInputDialog("Informe o valor da compra: ");
		String pcl = JOptionPane.showInputDialog("Informe o numero de parcelas: ");
		int numparcelas = Integer.valueOf(pcl);
		Double valorCompra= Double.valueOf(vlcompra);
		Double valorParcela = valorCompra / numparcelas;
		
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataInicial);//data inicial
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		
		for (int parcela = 1; parcela <= numparcelas; parcela ++) {
			calendar.add(Calendar.MONTH, 1);//adicionando o calendario com o mês começando pelo 1
			System.out.println("Parcela de Nº "+parcela+ " com valor de R$ "+valorParcela+""
					+ " com vencimento em "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
