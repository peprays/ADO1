package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu email: ");
        String email = input.nextLine();

        System.out.println("Deseja seu codigo em html ou json? ");
        String HoJ = input.nextLine();

        String html = "<html lang=\"pt-br\">\n" +
                "  <head>\n" +
                "    <title>Informações</title>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <h2>Nome: </h2>\n" +
                "    <p>" + nome + "</p>\n" +
                "    <h2>Email: </h2>\n" +
                "    <p>" + email + "</p>\n" +
                "  </body>\n" +
                "</html>";

        String json = "{\n" +
                "\"Nome\": " + "\"" + nome + "\",\n" +
                "\"Email\": " + "\"" + email + "\"\n" +
                "}";

        if (HoJ.equalsIgnoreCase("html")) {
            System.out.println(html);
        }else if (HoJ.equalsIgnoreCase("json")) {
            System.out.println(json);
        }else{
            System.out.println("Formato não reconhecido!");
        }


        }
    }
