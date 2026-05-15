public class InventarioLetras {
    private static final int CANTIDAD_LETRAS = 26; //26 letras tiene el abecedario en ingles
    private static final char PRIMERA_LETRA = 'a';
    private static final int DESPLAZAMIENTO_CESAR = 3; // = 3 porque se desplaza 3 posiciones

    private int[] conteos; // aca guarda el conteo de cada letra
    //la posicion 0 empieza desde a=0 b=1 ... asi hasta la z
    private int totalCount; // esto guarda la cantidad de letras contadas
    //tambien esto evita tener que recorrer todo el arreglo cada vez que se llama a side()
    private int nonZeroCount;
    //guarda las letras que tengan un conteo mayor a 0 esto ayuda a saber si el inventario esta vacio

public  InventarioLetras(String data) {
    conteos = new int[CANTIDAD_LETRAS]; //aca se crea el arreglo con 26 espacios para cada letra
    totalCount = 0; //al principio no hay letras contadas
    nonZeroCount = 0; //al principio ninguna posicion del arreglo tiene valores mayores que 0

    if (data == null) { //si viene como null lo deja como vacio, esto para evitar errores al recorrerlo
        data = "";
    }
    for  (int i = 0; i < data.length(); i++) { //recorre el texto letra por letra
        char letra = Character.toLowerCase(data.charAt(i));
        //esto hace que pasa cada caracter a minuscula para tratar igual a mayusculas y minusculas

        if (esLetraInglesa(letra)){ //esto es porque solo se trabaja con letras inglesas
            int posicion = obtenerPosicion(letra); // calculo en que posicion del arreglo debe de guardarse
            if (conteos[posicion] == 0) { //si es la priemra vez que aparece la letra aumenta nonZeroCount
                nonZeroCount++;
            }
            conteos[posicion]++; //aumenta el contador de esa letra
            totalCount++; //aumenta el total general de todas las letras
        }
    }
}
public char encriptarCesar(char letra) {
    //aca encripta una sola letra utilizando el desplaziamento de 3 usando Cesar
    return desplazarletra(letra DESPLAZAMIENTO_CESAR); //aca es para no repetir codigo
}


}
