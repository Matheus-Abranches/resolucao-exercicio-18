public class Main {
    public static void main(String[] args) {

        Alturas altura = new Alturas();

        double alturaFrancisco = 1.50;
        double alturaSarah = 1.30;
        int crescimentoFrancisco = 2;
        int crescimentoSarah = 3;

        int anos = altura.alturas(alturaFrancisco, alturaSarah, crescimentoFrancisco, crescimentoSarah);

        System.out.println("serão nescessarios " + anos + " anos para sarah ser maior q chiquin");

    }
}