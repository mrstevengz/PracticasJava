package models;

public class Palabra {
    public String palabra;

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

   public void determinarPalabra() {
        String reverse = "";
        String palabraTrim = palabra.toLowerCase().replaceAll("\\s", "");
        for (int i = palabraTrim.length() - 1; i >= 0; i--) {
            reverse += palabraTrim.charAt(i);
        }

        if (reverse.equals(palabraTrim)) {
            System.out.println("Su palabra " + palabra.replaceAll("\\s", "") + " es un palindromo");
        } else {
            System.out.println("Su palabra " + palabra + "no es un palindromo");
        }
   }
}
