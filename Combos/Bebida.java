package Combos;

public class Bebida implements Lanche{
	
	 private int ml;
	 
	    public Bebida() {
		}

	    public void setMl(int ml) {
	        this.ml = ml;
	    }

		public int getMl() {
	        return ml;
	    }
		
		public String getDescricao () {
			return "Coca-cola";
		}
		
	

}
