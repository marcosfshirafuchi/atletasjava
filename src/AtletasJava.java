import java.util.Locale;
import java.util.Scanner;

public class AtletasJava {
    /*
        Programa Atletas Java desenvolvido por Marcos Ferreira Shirafuchi
        Data: 14/01/2024
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int quantidadeDeAtletas, cont = 1, quantidadeDeMulheres = 0, quantidadeDeHomens = 0;
        String nome, sexo, atletaMaisAlto = "teste";
        double peso, altura, maiorAltura = 0, pesoMedioDosAtletas, porcentagemDeHomens = 0,
                somaDasAlturasDasMulheres = 0, alturaMediaDasMulheres = 0, somaPesoDosAtletas = 0;
        System.out.print("Qual a quantidade de atletas? ");
        quantidadeDeAtletas = sc.nextInt();
        do {
            System.out.printf("Digite os dados do atleta numero %d:\n", cont);
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine().trim();

            System.out.print("Sexo: ");
            sexo = sc.nextLine().toUpperCase().trim();
            while (!(sexo.equals("F")) && (!sexo.equals("M"))) {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.nextLine().toUpperCase().trim();
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            while (altura < 1) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }
            if (sexo.equals("F")) {
                quantidadeDeMulheres++;
                somaDasAlturasDasMulheres += altura;
            } else {
                quantidadeDeHomens++;
            }

            if (altura > maiorAltura) {

                maiorAltura = altura;
                atletaMaisAlto = nome;
            }
            System.out.print("Peso: ");
            peso = sc.nextDouble();
            while (peso < 1) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }
            somaPesoDosAtletas += peso;
            cont++;
        } while (cont <= quantidadeDeAtletas);
        System.out.println("RELATÓRIO:");
        pesoMedioDosAtletas = somaPesoDosAtletas / quantidadeDeAtletas;
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedioDosAtletas);
        System.out.printf("Atleta mais alto: %s\n", atletaMaisAlto);
        if (quantidadeDeMulheres != 0) {
            porcentagemDeHomens = ((double) quantidadeDeHomens / quantidadeDeAtletas) * 100;
            alturaMediaDasMulheres = somaDasAlturasDasMulheres / quantidadeDeMulheres;
            System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemDeHomens);
            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaDasMulheres);
        } else {
            porcentagemDeHomens = ((double) quantidadeDeHomens / quantidadeDeAtletas) * 100;
            System.out.printf("Porcentagem de homens: %.1f %%%n", porcentagemDeHomens);
            System.out.println("Não há mulheres cadastradas");
        }
        sc.close();
    }
}
