package hospital;

public class Internacao {
    
    private static int id = 1;
    private int idIntern = 0 , qtdDiasIntern = 0;
    private String motivoIntern;
    private double valorI = 0, valorTotI=0 ;
    private static double valorTodasI=0;

    public Internacao(){
        this.idIntern = id;
        id++;
    }
    
    double valorInternacao(){
        valorTotI = this.valorI*this.qtdDiasIntern;
        valorTodasI += this.valorTotI;
        return valorTotI;
    }
    
    public int getIdIntern() {
        return idIntern;
    }


    public int getQtdDiasIntern() {
        return qtdDiasIntern;
    }

    public void setQtdDiasIntern(int qtdDiasIntern) {
        this.qtdDiasIntern = qtdDiasIntern;
    }

    public String getMotivoIntern() {
        return motivoIntern;
    }

    public void setMotivoIntern(String motivoIntern) {
        this.motivoIntern = motivoIntern;
    }

    public double getValorI() {
        return valorI;
    }

    public void setValorI(double valorI) {
        this.valorI = valorI;
    }

    public double getValorTotI() {
        return valorTotI;
    }

    public void setValorTotI(double valorTotI) {
        this.valorTotI = valorTotI;
    }

    public static double getValorTodasI() {
        return valorTodasI;
    }

    public static void setValorTodasI(double valorTodasI) {
        Internacao.valorTodasI = valorTodasI;
    }

    
 
    
    
}
