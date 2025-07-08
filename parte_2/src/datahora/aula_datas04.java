package datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class aula_datas04 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // texto para data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formato ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // considere como horário de londres (Zulu Time)

        LocalDate pastWeekLocalDate = d04.minusDays(7); // instancia uma nova data, que é d04 menos 7 dias
        LocalDate nextWeekLocalDate = d04.plusDays(7); // instancia uma nova data, que é d04 mais 7 dias
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println();
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // instancia uma nova data e hora, que é d05 menos 7 dias
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); // instancia uma nova data e hora, que é d05 mais 7 dias
        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println();
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // instancia uma quantidade e tipo de tempo, que é d06 menos 7 dias
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); // instancia uma quantidade e tipo de tempo, que é d06 mais 7 dias
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //-----------------------------------------------------------------------------------------------------------------

        Duration t1 = Duration.between(pastWeekLocalDateTime, d05); // calcula a duração entre duas data-hora
        System.out.println("t1 dias = " + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()); // calcula a duração entre duas data-hora // não calcula entre dois LocalDateTime, é necessário converter para LocalDate
        System.out.println("t2 dias = " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t3 dias = " + t3.toDays());

        Duration t4 = Duration.between(d06, pastWeekInstant); // a inversão dos valores resultam em um valor negativo
        System.out.println("t3 dias = " + t4.toDays());
    }
}
