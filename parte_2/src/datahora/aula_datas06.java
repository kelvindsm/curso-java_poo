package datahora;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class aula_datas06 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // horario UTC. No console será impresso "12:42:07", horário brasileiro
        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        cal.add(Calendar.HOUR_OF_DAY, 4); // adiciona 4 horas
        d = cal.getTime();
        System.out.println(d);

        int minutes = cal.get(Calendar.MINUTE); // retorna a quantidade de minutos
        int month = cal.get(Calendar.MONTH); // retorna o mês: retorna 5 pois a contagem de meses se inicia no valor 0 (janeiro)
        int month2 = 1 + cal.get(Calendar.MONTH); // retorna o mês: é necessário adicionar "1 +" para que retorne o valor corretamente

        System.out.println("Minutos: " + minutes);
        System.out.println("Month: " + month);
        System.out.println("Month ajustado: " + month2);
    }
}
