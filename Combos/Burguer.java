package Combos;

public class Burguer implements Lanche{
	
	 private int gramas;
	 
	    public Burguer() {
		}

	    public void setGramas(int gramas) {
	        this.gramas = gramas;
	    }

		public int getGramas() {
	        return gramas;
	    }
		
		public String getDescricao () {
			return "Pão, carne e queijo";
		}

}
