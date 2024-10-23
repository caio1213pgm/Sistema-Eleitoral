import java.util.Scanner;

public class CadastroCandidato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos candidatos deseja adcionar? ");
        int n = sc.nextInt();

        Candidato[] candidatos = new Candidato[n];

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("Digite o nome do candidato: ");
            String nome = sc.next();

            System.out.println("Digite o número do partido do seu candidato: ");
            int Numpartido = sc.nextInt();

            candidatos[i] = new Candidato(nome,  Numpartido, 0);
        }

        System.out.println("Quantos votos você deseja adcionar");
        int votos = sc.nextInt();
        int votosNulos = 0;

        for(int i = 0;  i < votos; i++){
            System.out.println("Digite o número do candidato que você deseja votar: ");
            int numcandidato = sc.nextInt();
            boolean encontrarCandidato = false;

            for (Candidato candidato : candidatos) {
                boolean verificarNumero = numcandidato == candidato.getNumeroCandidato();

                if (verificarNumero) {
                    candidato.votar();
                    encontrarCandidato = true;
                    break;
                }
            }

            if (!encontrarCandidato) {
                System.out.println("Candidato não encontrado");
                votosNulos++;
            }
        }

        System.out.println("Resultado das eleições");
        for (Candidato candidato : candidatos) {
            candidato.apresentarCandidato();
        }
        System.out.println("Votos nulos: "+ votosNulos);

        Candidato vencedor = candidatos[0];

        for(int i = 1; i < candidatos.length; i++){
            if (candidatos[i].getQuantidadeVotos() > vencedor.getQuantidadeVotos()) {
                vencedor = candidatos[i];
            }
        }

        System.out.println("---Candidato mais votado---");
        vencedor.apresentarCandidato();

        sc.close();
    }
}
