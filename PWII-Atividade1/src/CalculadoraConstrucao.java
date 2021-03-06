
public class CalculadoraConstrucao {
	public static void main(String[] args) {
		int diametro = 6;
		int largura = 20;
		int comprimento = 20;
		
		double custoPiscina = Piscina.total(Piscina.areaPiscina(Piscina.raio(diametro)));
		double custoCasa = Casa.totalCasa(Casa.porcentagemCasa(Casa.areaCasa(comprimento, largura)));
		double total = custoPiscina + custoCasa;
		
		System.out.println("Custo da casa: " + String.format("R$%.2f", custoCasa));
		System.out.println("Custo da piscina: " + String.format("R$%.2f", custoPiscina));
		System.out.println("Custo total da costru��o:" + String.format("R$%.2f", total));
	}
}
