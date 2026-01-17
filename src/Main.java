import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime data1 = ZonedDateTime.parse("2023-03-01T13:00:00Z");
        ZonedDateTime data2 = ZonedDateTime.parse("2024-03-01T13:00:00Z");

        boolean primaPrecedente = data1.isBefore(data2);
        boolean secondaSuccessiva = data2.isAfter(data1);
        boolean dateUguali = data1.isEqual(data2);
        
        System.out.println("La prima data è precedente alla seconda? " + primaPrecedente);
        System.out.println("La seconda data è successiva alla prima? " + secondaSuccessiva);
        System.out.println("Le due date sono uguali? " + dateUguali);
    }
}