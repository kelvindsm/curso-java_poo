package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class aula_datas {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now(); // data atual
        LocalDateTime d02 = LocalDateTime.now(); // data-hora local
        Instant d03 = Instant.now(); // data-hora GMT de Londres (Zulu time)

        LocalDate d04 = LocalDate.parse("2022-07-20"); // texto para data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formato ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //fuso horário com 03:00, especificando um horario diferente do GMT (aqui ele informa a hora de algum outro lugar com fuso horario de -03:00 quando a hora de Londres for 01:30)

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // texto formato customizado para virar uma data-hora
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 7, 20); // elementos de datas separados para o formato data-hora
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

        System.out.println("d01 = " + d01.toString()); // quando chama um objeto qualquer dentro de um print no java, a propria execução do programa detecta que se está num contexto de concatenação de string, sendo assim, ele chama o toString do obeto de forma implicita.
        System.out.println("" + d02); // o toString de LocalDate, LocalDateTime e Instant geram as informações automaticamente no formato ISO 8601
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
