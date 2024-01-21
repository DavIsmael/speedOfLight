//Primeiro projeto que fiz e me diverti kkkk, achei q ficou daora ent vou deixar aqui
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        long elementosConversao[] = new long[3];
        long distancia = 0;
        String mensagensCondicionais[] = {
          "Quantas horas em 1 dia? ",
          "Quantos minutos em 1 hora? ",
          "Quantos segundos em 1 minuto? "
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Velocidade da Luz: ");
        long velocidadeDaLuz = scanner.nextLong();
        System.out.println("A velocidade da luz é de: " + velocidadeDaLuz + " km/s!");
        System.out.print("Dias para a velocidade da luz percorrer: ");
        long diasPraSegundos = scanner.nextLong();
        long dias = diasPraSegundos;
        System.out.println("Dias: " + dias);
        System.out.println("Agora bora converter o valor de dias (" + dias + ") em segundos! Para fazer isso, siga as instruções abaixo: ");
        System.out.println("Digite agora quantas horas 1 dia tem, quantos minutos uma hora tem e quantos segundos 1 minuto tem");
        for(int i = 0; i < 3; ++i){
            System.out.print(mensagensCondicionais[i]);
            elementosConversao[i] = scanner.nextLong();
            diasPraSegundos *= elementosConversao[i];
            if(i == 2){
                scanner.close();
                System.out.println(dias + " dias tem " + diasPraSegundos + " segundos!! Macete - Se 1 dia tem 86400 segundos, e a quantidade de dias da sua escolha é 10, 100, 1000... você só precisa acrescentar mais 0's ao final da base (86400s) de acordo, ou seja, 10 dias são 864000s!!");
                distancia = velocidadeDaLuz * diasPraSegundos;
                System.out.println("Em " + dias + " dias a velocidade da luz percorreu " + distancia + " km!");
            }
        }
    }
}