public class Main {

    public static void main(String[] args) {
        /* encode */
        Zipper.encodeZip("/home/racso/Música/Seleccionado.txt", "/home/racso/Música/Comprimido.txt");
        /* decode */
        Zipper.decodeZip("/home/racso/Música/Comprimido.txt", "/home/racso/Música/Descomprimido.txt");
    }
}
