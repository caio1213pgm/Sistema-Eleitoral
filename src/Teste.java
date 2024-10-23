import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Candidato canditado01  = new Candidato("João", 25, 0);
        canditado01.apresentarCandidato();

        System.out.println("Votos para "+  canditado01.getNomeCandidato());
        int  votos = sc.nextInt();

        for(int i = 0; i < votos; i++){
            canditado01.votar();
        }

        canditado01.apresentarCandidato();

        sc.close();
    }
}
