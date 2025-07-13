package br.com.show;

import br.com.show.ticket.MidTicket;
import br.com.show.ticket.Ticket;
import br.com.show.ticket.TicketFamily;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static MidTicket midTicket = new MidTicket();
    private static final Ticket ticket = new Ticket();
    private final static TicketFamily ticketFamily = new TicketFamily();


    public static void main(String[] args) {

        ticket.setValue(25);

        System.out.println("Compra de Ingressos");
        System.out.println("Ingresso:");
        System.out.println("==================");

        System.out.println("Insira o seu nome:");
        ticket.setName(scanner.nextLine());
        System.out.println("==================");

        System.out.println("""
                Qual tipo de Ingresso deseja?
                1 - Normal
                2 - Meia Entrada
                3 - Familia""");
        int option = scanner.nextInt();
        ticketType(option);
        System.out.println("==================");

        System.out.println("""
                Qual filme deseja assistir?
                1 - Homem De Ferro
                2 - Capitão America
                3 - Thor
                """);
        int movie = scanner.nextInt();
        typeMovie(movie);
        System.out.println("==================");

        System.out.println("""
                Qual idioma do filme deseja assitir:
                1 - Dublado
                2 - Legendado
                """);
        int idioms = scanner.nextInt();
        language(idioms);
        System.out.println("==================");

        System.out.println("Dados do Ingresso");
        System.out.println("==================");
        System.out.println("Nome: " + ticket.getName());
        System.out.println("Valor: " + reservation.getValue());
        System.out.println("Filme: " + ticket.getMovieName());
        System.out.println("Idioma: " + ticket.getLanguage());
    }

    private static void language(int idioms) {
        if (idioms == 1) {
            ticket.setLanguage("Dublado");
        } else if (idioms == 2) {
            ticket.setLanguage("Legendado");
        } else {
            System.out.println("Opção Invalida");
        }
    }

    private static Ticket reservation;

    private static void ticketType(int option){
        if (option == 1) {
            reservation = ticket;
            ticket.setValue(ticket.getValue());
        } else if (option == 2) {
            reservation = midTicket;
            midTicket.setValue(ticket.getValue());
            System.out.println("O valor do ingresso é: " + midTicket.getValue());
        } else if (option == 3) {
            reservation = ticketFamily;
            ticketFamily.setValue(ticket.getValue());
            System.out.println("Ingresso para quantas pessoas?");
            ticketFamily.setPersonNumber(scanner.nextInt());
            System.out.println("O valor do ingresso para " + ticketFamily.getPersonNumber() + "pessoas é: " + ticketFamily.getValue());
        } else {
            System.out.println("Opção Invalida");
        }
    }
    private static void typeMovie(int movie) {
        if (movie == 1) {
            Main.ticket.setMovieName("Homem De Ferro");
        } else if (movie == 2) {
            Main.ticket.setMovieName("Capitão America");
        } else if (movie == 3) {
            Main.ticket.setMovieName("Thor");
        } else {
            System.out.println("Opção Invalida");
        }
    }
}