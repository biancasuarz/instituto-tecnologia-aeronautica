package Escola;

public class Principal {

    public static void main(String[] args) {

        Aluno Bianca = new Aluno();
        Bianca.bim1 = 94;
        Bianca.bim2 = 95;
        Bianca.bim3 = 98;
        Bianca.bim4 = 99;

        System.out.println(Bianca.media());
        System.out.println(Bianca.passouDeAno());

        Aluno Guerra = new Aluno();
        Guerra.bim1 = 54;
        Guerra.bim2 = 45;
        Guerra.bim3 = 68;
        Guerra.bim4 = 52;

        System.out.println(Guerra.media());
        System.out.println(Guerra.passouDeAno());
    }
}
