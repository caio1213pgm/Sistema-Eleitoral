public class Candidato {
    private String nomeCandidato;
    private int numeroCandidato;
    private int quantidadeVotos;
    
    public Candidato(String nomeCandidato, int numeroCandidato, int quantidadeVotos) {
        this.nomeCandidato = nomeCandidato;
        this.numeroCandidato = numeroCandidato;
        this.quantidadeVotos = quantidadeVotos;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(int numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public int getQuantidadeVotos() {
        return quantidadeVotos;
    }

    public void setQuantidadeVotos(int quantidadeVotos) {
        this.quantidadeVotos = quantidadeVotos;
    }

    public void apresentarCandidato(){
        System.out.println("Nome do Candidato: "+getNomeCandidato());
        System.out.println("Número do Candidato: "+getNumeroCandidato());
        System.out.println("Quantidade de votos: "+getQuantidadeVotos());
        System.out.println("");
    }

    public void votar(){
        quantidadeVotos++;
        System.out.println("Voto adcionado com sucesso!");
    }
}
