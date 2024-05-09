package Combos;

public class Combo {
	
    private Burguer burguer;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public Combo() {
        this.burguer = new Burguer();
        this.sobremesa = new Sobremesa();
        this.bebida = new Bebida();
    }

    public void CriarCombo() {
        System.out.println("Itens do combo");
        System.out.println("Burguer | Gramas: " + burguer.getGramas());
        System.out.println("Sobremesa | Tamanho: " + sobremesa.getTamanho());
        System.out.println("Bebida | Ml: " + bebida.getMl());
    }

	public void CriarCombo(int tipo) {
		if (tipo == 1) {
			burguer.setGramas(200);
			sobremesa.setTamanho("Médio");
			bebida.setMl(200);
		}
		else
		if (tipo ==2) {
			burguer.setGramas(300);
			sobremesa.setTamanho("Grande");
			bebida.setMl(300);
		}
		
		
	        System.out.println("Itens do combo");
	        System.out.println("Burguer | Gramas: " + burguer.getGramas());
	        System.out.println("Sobremesa | Tamanho: " + sobremesa.getTamanho());
	        System.out.println("Bebida | Ml: " + bebida.getMl());


	}
	
}
