package hospital;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);         
        Paciente p = new Paciente();
        Medico m = new Medico();
        Enfermeiro e = new Enfermeiro();
        Internacao i1 = new Internacao();
        Internacao i2 = new Internacao();
        
        System.out.println("Digite o nome do paciente: ");
        p.setNome(scan.nextLine());
        System.out.println("Digite o tipo sanguineo do paciente: ");
        p.setTipoSang(scan.nextLine());
        System.out.println("Digite a data de nascimento do paciente: ");
        p.setDataNasc(scan.nextLine());
        System.out.println("Digite o CPF do paciente: ");
        p.setCPF(scan.nextInt());
        scan.nextLine();
//------------------------------------------------------------------------------------------------
        System.out.println("Digite o nome do medico: ");
        m.setNome(scan.nextLine());
        System.out.println("Digite a data de nascimento do medico: ");
        m.setDataNasc(scan.nextLine());
        System.out.println("Digite o CPF do medico: ");
        m.setCPF(scan.nextInt());
        scan.nextLine();
        System.out.println("Digite a especialidade do medico: ");
        m.setEspecialidade(scan.nextLine());
//------------------------------------------------------------------------------------------------        
        System.out.println("Digite o nome do enfermeiro responsavel: ");
        e.setNome(scan.nextLine());
        System.out.println("Digite o CPF do enfermeiro responsavel: ");
        e.setCPF(scan.nextInt());
        scan.nextLine();
        System.out.println("Digite a data de nascimento do enfermeiro responsavel: ");
        e.setDataNasc(scan.nextLine());
        
        e.adicionaPac();
        e.adicionaPac();
        e.adicionaPac();
//------------------------------------------------------------------------------------------------ 
        System.out.println("Digite o motivo da internacao: ");
        i1.setMotivoIntern(scan.nextLine());
        System.out.println("Digite o valor diario da internacao: ");
        i1.setValorI(scan.nextDouble());
        System.out.println("Digite a quantidade de dias que o paciente ficou internado: ");
        i1.setQtdDiasIntern(scan.nextInt());
        scan.nextLine();
//------------------------------------------------------------------------------------------------
        System.out.println("Digite o motivo da internacao: ");
        i2.setMotivoIntern(scan.nextLine());
        System.out.println("Digite o valor diario da internacao: ");
        i2.setValorI(scan.nextDouble());
        System.out.println("Digite a quantidade de dias que o paciente ficou internado: ");
        i2.setQtdDiasIntern(scan.nextInt());
        scan.nextLine();
//------------------------------------------------------------------------------------------------
System.out.println("-----------------------------------------------------------------------------------------------------");
        
        System.out.println("O ID da internacao e: "+i1.getIdIntern());
        System.out.println("O motivo da internacao e: "+i1.getMotivoIntern());
        System.out.println("O valor diario da internacao e: "+i1.getValorI());
        System.out.println("O paciente ficou: "+i1.getQtdDiasIntern()+" dias internado");
        System.out.println("O valor total da internacao e: "+i1.valorInternacao());
        System.out.println("O valor total de todas as internacoes do paciente e: "+Internacao.getValorTodasI());

        System.out.println("O ID da internacao e: "+i2.getIdIntern());
        System.out.println("O motivo da internacao e: "+i2.getMotivoIntern());
        System.out.println("O valor diario da internacao e: "+i2.getValorI());
        System.out.println("O paciente ficou: "+i2.getQtdDiasIntern()+" dias internado");
        System.out.println("O valor total da internacao e: "+i2.valorInternacao());
        System.out.println("O valor total de todas as internacoes do paciente e: "+Internacao.getValorTodasI());
        
        System.out.println("O nome do paciente e: "+p.getNome());
        System.out.println("O tipo sanguineo do paciente e: "+p.getTipoSang());
        System.out.println("A data de nascimento do paciente e: "+p.getDataNasc());
        System.out.println("O CPF do paciente e: "+p.getCPF());
        
        System.out.println("O nome do medico e: "+m.getNome());
        System.out.println("A data de nascimento do medico e: "+m.getDataNasc());
        System.out.println("O CPF do medico e: "+m.getCPF());
        System.out.println("A especialidade do medico e: "+m.getEspecialidade());
        
        System.out.println("O nome do enfermeiro responsável e: "+e.getNome());
        System.out.println("A data de nascimento do enfermeiro responsável e: "+e.getDataNasc());
        System.out.println("O CPF do enfermeiro responsável e: "+e.getCPF());
        System.out.println("O enfermeiro : "+e.getNome()+" responsavel pelo paciente "+p.getNome()+" possui "+e.getNumPacientes()+" pacientes ao todo");
        
    }
    
}
