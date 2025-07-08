package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class aula_datas03 {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20"); // texto para data
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // formato ISO 8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // considere como horário de londres (Zulu Time)

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // converte o instante para uma data local considerando um fuso-horario
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); // fuso-horario de Portugal
// ------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("Dia de d04 = " + d04.getDayOfMonth()); // pega o dia
        System.out.println("Mês de d04 = " + d04.getMonthValue()); // pega o mes
        System.out.println("Ano de d04 = " + d04.getYear()); // pega o ano

        System.out.println("Hora de d05" + d05.getHour()); // pega a hora
        System.out.println("Minuto de d05" + d05.getMinute()); // pega o minuto

    }
}
