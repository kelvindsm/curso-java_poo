package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class aula_datas02 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // texto para data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formato ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // customização para o formato "dd//MM/yyyy"
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // customização para o formato "dd//MM/yyyy HH:mm"
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // considerando o fuso-horario do sistema local
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // customiza o texto para o formato ISO sem considerar o fuso-horario
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // customiza o texto para o formato ISO considerando o fuso-horario

        System.out.println("Formato dd/MM/yyyy " + d04.format(fmt1));
        System.out.println("Formato dd/MM/yyyy " + fmt1.format(d04));
        System.out.println("Formato dd/MM/yyyy " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        System.out.println(d05.format(fmt2));
        System.out.println(d05.format(fmt4));
        System.out.println();
        System.out.println(fmt3.format(d06));
        System.out.println(fmt5.format(d06));
        System.out.println();
        System.out.println(d06.toString());
    }
}
