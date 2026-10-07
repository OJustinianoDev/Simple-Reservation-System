import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        GerenciadorReservas gerenciadorMenu = new GerenciadorReservas();

        boolean executando = true;

        while (executando) {
            System.out.println("---------------------------");
            System.out.println(" [ 1 ] Criar reserva");
            System.out.println(" [ 2 ] Consultar reservas");
            System.out.println(" [ 3 ] Remarcar reserva");
            System.out.println(" [ 4 ] Cancelar reserva");
            System.out.println(" [ 0 ] Sair do sistema");
            System.out.println("--------------------------");

            System.out.print("Escolha um opção: ");
            String opcao = input.nextLine();

            if (opcao.equals("1")) {
                System.out.println();
                gerenciadorMenu.CriarReservas();
            }
            else if (opcao.equals("2")) {
                System.out.println();
                gerenciadorMenu.ConsultarReservas();
            }
            else if (opcao.equals("3")) {
                System.out.println();
                gerenciadorMenu.RemarcarReserva();
            }
            else if (opcao.equals("4")) {
                System.out.println();
                gerenciadorMenu.CancelarReserva();
            } else if (opcao.equals("0")) {
                System.out.println();
                System.out.println("Encerrando...");
                executando = false;

            }
            else {
                System.out.println("[ERRO] Escolha uma opção válida");
            }
        }
    }
}