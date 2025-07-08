package datahora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class aula_datas05 {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018"); // define uma data estabelecida pelo usuário
        Date y2 = sdf2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // formato ISO 8601 no padrão UTC, imprime diferente (12:42:07) pois leva em consideração o fuso-horario da maquiina


        Date x1 = new Date(); // cria uma data com o horário atual
        Date x2 = new Date(System.currentTimeMillis()); // cria uma data com o horario de agora, pega o instante do sistema, converte e milissegundos e cria a data com o valor
        Date x3 = new Date(0L); // retorna o milissegundo zero armazenado na classe ...
        Date x4 = new Date(1000L * 60L * 60L * 5L); // retorna para a hora cinco a partir de ...

        System.out.println("Sem formatação");
        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);
        System.out.println("y3 = " + y3);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
        System.out.println("-------------------------------------------------------");
        System.out.println("Imprime a data no fuso-horario Brasileiro");
        System.out.println("y1 = " + sdf2.format(y1));
        System.out.println("y2 = " + sdf2.format(y2));
        System.out.println("y3 = " + sdf2.format(y3));
        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("x3 = " + sdf2.format(x3));
        System.out.println("x4 = " + sdf2.format(x4));
        System.out.println("-------------------------------------------------------");
        System.out.println("Imprime a data e hora no formato padrâo UTC");
        System.out.println("y1 = " + sdf3.format(y1));
        System.out.println("y2 = " + sdf3.format(y2));
        System.out.println("y3 = " + sdf3.format(y3));
        System.out.println("x1 = " + sdf3.format(x1));
        System.out.println("x2 = " + sdf3.format(x2));
        System.out.println("x3 = " + sdf3.format(x3));
        System.out.println("x4 = " + sdf3.format(x4));
    }
}
