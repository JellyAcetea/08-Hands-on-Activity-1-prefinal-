import java.util.Scanner;
import java.time.LocalTime;

public class Monday extends Weekday {
    private String alarmTime;

    @Override
    public void setAlarm(String time) {
        this.alarmTime = time;
    }

    @Override
    public void showAlarm() {
        LocalTime alarm = LocalTime.parse(alarmTime);
        LocalTime now = LocalTime.now();

        if (alarm.isAfter(now)) {
            System.out.println("I'll wake you up later!");
        } else {
            System.out.println("Alarm is set for tomorrow!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monday monday = new Monday();

        System.out.print("Enter time for alarm in this format (HH:MM) : ");
        String time = scanner.nextLine();

        monday.setAlarm(time);
        monday.showAlarm();
    }
}
