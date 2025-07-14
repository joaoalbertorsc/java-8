import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        System.out.println(olimpiadasRio);

        Period periodo = Period.between(hoje, olimpiadasRio);
        System.out.println(periodo);

        LocalDate proximas01impiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximas01impiadas);
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximas01impiadas.format(formatador);
        System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora. format(formatadorComHoras)) ;
        LocalTime intervalo = LocalTime. of(15, 30);
        System. out. println(intervalo) ;

    }
}
