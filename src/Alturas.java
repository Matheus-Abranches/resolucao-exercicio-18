public class Alturas {

    public int alturas(double alturaFrancisco, double alturaSarah, int crescimentoFrancisco, int crescimentoSarah){

        int anos = 0;


        while (alturaSarah <= alturaFrancisco){
            alturaFrancisco += crescimentoFrancisco / 100.0;
            alturaSarah += crescimentoSarah / 100.0;
            anos++;
        }

        return anos;
    }

}
