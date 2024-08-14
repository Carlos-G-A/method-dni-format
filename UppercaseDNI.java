public class UppercaseDNI {

  /**
  * Convierte las letras del DNI a mayúsculas.
  *
  * @param c El DNI en formato de cadena de caracteres.
  * @return El DNI con todas las letras convertidas a mayúsculas.
  */
	
	public static String formatDNI (String c) {
		
		String copia = ""; //Creo un String vacio donde para almacenar el String formateado
		
		for (int i = 0; i < c.length(); i++) {	//Recorro cada uno de los caracteres del String original
			
			if(Character.isLetter(c.charAt(i))) {	
				
				copia += Character.toUpperCase(c.charAt(i));	//Si el caracter es una letra lo convierto en mayúsculas y lo guardo en la copia
				
			}
			
			else {
				
				copia += c.charAt(i);	//Si no es una letra lo guardo en la copia directamente
				
			}
			
		}
		
		return copia;	//Por último devuelvo la copia
		
	}

}
