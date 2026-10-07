import java.util.Scanner;

public class GerenciadorReservas {

    Scanner input = new Scanner(System.in);

    // Atributos

    private String entrada;
    private String saida;
    private String horario_entrada;
    private String horario_saida;
    private String descricao;
    private String tipo;
    private boolean temReserva = false;

    public void CriarReservas() { // Opcao 1

        System.out.println("--- REGISTRAR RESERVA ---");

        System.out.print("Dia de entrada: ");
        this.entrada = input.nextLine();

        System.out.print("Dia de saída: ");
        this.saida = input.nextLine();

        System.out.print("Horário de entrada: ");
        this.horario_entrada = input.nextLine();

        System.out.print("Horário de saída: ");
        this.horario_saida = input.nextLine();

        System.out.print("Descrição: ");
        this.descricao = input.nextLine();

        System.out.print("Tipo de reserva: ");
        this.tipo = input.nextLine();

        this.temReserva = true;
        System.out.println("Reserva registrada com sucesso!");
    }

    public void ConsultarReservas() { // Opcao 2

        System.out.println("--- CONSULTAR RESERVAS ---");

        if (!temReserva) {
            System.out.println("[ERRO] Nenhuma reserva registrada!");
            return;
        }

        System.out.println("Tipo " + this.tipo);
        System.out.println("Descrição " + this.descricao);
        System.out.println("Entrada: " + this.entrada + " ás " + this.horario_entrada);
        System.out.println("Saída: " + this.saida + " ás " + this.horario_saida);
    }

    public void RemarcarReserva() { // Opcao 3

        System.out.println("--- REMARCAR RESERVA ---");

        if (!temReserva) {
            System.out.println("[ERRO] Nenhuma reserva registrada!");
            return;
        }

        System.out.print("Novo dia de entrada: ");
        this.entrada = input.nextLine();

        System.out.print("Novo dia de saída: ");
        this.saida = input.nextLine();

        System.out.print("Novo horário de entrada: ");
        this.horario_entrada = input.nextLine();

        System.out.print("Novo horário de saída: ");
        this.horario_saida = input.nextLine();

        System.out.println("Reserva remarcada com sucesso!");
    }

    public void CancelarReserva() { // Opcao 4

        System.out.println("--- CANCELAR RESERVA ---");

        if (!temReserva) {
            System.out.println("[ERRO] Nenhuma reserva registrada!");
            return;
        }

        System.out.println("Reserva atual encontrada:");
        System.out.println("Tipo " + this.tipo + " | Descrição: " + this.descricao);
        System.out.println("Período: " + this.entrada + " até " + this.saida);
        System.out.println("------------------------------------------------------");

        System.out.println("Tem certeza que deseja cancelar a reserva? [S/N]");
        String confirmacao = input.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
            this.entrada = null;
            this.saida = null;
            this.horario_entrada = null;
            this.horario_saida = null;
            this.descricao = null;
            this.tipo = null;
            this.temReserva = false;

            System.out.println("Reserva cancelada com sucesso!");
        } else {
            System.out.println("[ATENÇÃO] Operação canelada, reserva mantida!");
        }
    }
}