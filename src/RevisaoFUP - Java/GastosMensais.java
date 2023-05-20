public class GastosMensais {
    public static void main(String[] args) {
        int janMes = 15000;
        int fevMes = 23000;
        int marMes = 17000;
        int gastosTrimestre;
        int mediaMensal;

        gastosTrimestre = janMes + fevMes + marMes;

        System.out.println("Gastos do trimestre: R$" + gastosTrimestre);
        mediaMensal = gastosTrimestre  / 3;
        System.out.println("Media Mensal: R$" + mediaMensal);
    }
}
