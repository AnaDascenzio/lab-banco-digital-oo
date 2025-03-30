public class Emprestimo {

    public static void calcularLimite(double rendaMensal, double comprometimentoAtual, double score) {
        double limiteBase = rendaMensal * 10;
        double limiteDisponivel = limiteBase - comprometimentoAtual; 
        if (score < 300) {
            limiteDisponivel *= 0.2;
            System.out.println("Você possui R$"+ limiteDisponivel + " de limite disponível para empréstimo");
        } else if (score < 600) {
            limiteDisponivel *= 0.5;
            System.out.println("Você possui R$"+ limiteDisponivel + " de limite disponível para empréstimo");
        } else if (score >= 800) {
            limiteDisponivel *= 0.8;
            System.out.println("Você possui R$"+ limiteDisponivel + " de limite disponível para empréstimo");
        }
    }
    
}
