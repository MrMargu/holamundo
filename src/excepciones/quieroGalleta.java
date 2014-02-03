package excepciones;

public class quieroGalleta {

	public static void main(String[] args) {
		String s= null;
		//s = "Galleta";
		//s = "Acelgas";
		System.out.println(quieroGalleta(s));
		
		static String quieroGalleta(String s)throws NullPointerException{
			if (s.equals("Galleta"))
				return "Gracias";
			else
				return("Quiero una galleta¡¡¡");
		}

	}

}
