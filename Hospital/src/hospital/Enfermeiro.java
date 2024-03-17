package hospital;

public class Enfermeiro extends Pessoa{
    
    private int numPacientes=0;
    
    public int adicionaPac(){
        this.numPacientes += 1;
        return this.numPacientes;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }
    
   
}
