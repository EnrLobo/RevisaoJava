package hospital;

import java.util.Scanner;

public class Paciente extends Pessoa {
    
    Scanner scan = new Scanner(System.in);
    private String tipoSang, enferResp;

    

    public String getTipoSang() {
        return tipoSang;
    }

    public void setTipoSang(String tipoSang) {
        this.tipoSang = tipoSang;
    }

    public String getEnferResp() {
        return enferResp;
    }

    public void setEnferResp(String enferResp) {
        this.enferResp = enferResp;
    }
    
    
    
}
