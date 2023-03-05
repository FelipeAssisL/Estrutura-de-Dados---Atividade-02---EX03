package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	public double Soma(int n) {
		if(n==1) {
			return 1.0;
		} else {
//			int inteiro = n;
//			double soma = 1/n;
			return 1.0/n + Soma(n-1);
		}
	}
}
