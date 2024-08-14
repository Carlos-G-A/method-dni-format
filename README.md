# method-dni-format
Este repositorio contiene un método en Java que transforma las letras de un DNI a mayúsculas. Es una solución sencilla a un problema de usabilidad que me encontré al utilizar la "Chave365", un sistema de identificación en Galicia.

## Uso
El método `formatDNI` recorre cada carácter de un String, verifica si es una letra, y la convierte a mayúscula si es necesario.

```java
public class UppercaseDNI {

    public static String formatDNI(String c) {
        String copia = ""; // Creo un String vacío para almacenar el String formateado

        for (int i = 0; i < c.length(); i++) { // Recorro cada uno de los caracteres del String original

            if (Character.isLetter(c.charAt(i))) {
                copia += Character.toUpperCase(c.charAt(i)); // Si el carácter es una letra, lo convierto en mayúscula y lo guardo en la copia
            } else {
                copia += c.charAt(i); // Si no es una letra, lo guardo en la copia directamente
            }
        }

        return copia; // Por último, devuelvo la copia
    }
}
```
