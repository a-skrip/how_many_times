import java.time.*;
import java.time.temporal.ChronoUnit;

public class HowManyTimes {
    public static void main(String[] args) {

        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate sputnikLaunchDate = LocalDate.of(1979, Month.JANUARY, 5);
        LocalTime sputnikLaunchTime = LocalTime.of(1, 28, 34);
        LocalDateTime sputnikLaunchAt = LocalDateTime.of(sputnikLaunchDate, sputnikLaunchTime);

        long years = ChronoUnit.YEARS.between(sputnikLaunchAt, nowDateTime);
        LocalDateTime reducedYears = sputnikLaunchAt.plusYears(years);

        long mounts = ChronoUnit.MONTHS.between(reducedYears, nowDateTime);
        LocalDateTime reduceMounts = reducedYears.plusMonths(mounts);

        long days = ChronoUnit.DAYS.between(reduceMounts, nowDateTime);
        LocalDateTime reduceDays = reduceMounts.plusDays(days);

        long hours = ChronoUnit.HOURS.between(reduceDays, nowDateTime);
        LocalDateTime reduceHours = reduceDays.plusHours(hours);

        long minutes = ChronoUnit.MINUTES.between(reduceHours, nowDateTime);
        LocalDateTime reduceMinutes = reduceHours.plusMinutes(minutes);

        long second = ChronoUnit.SECONDS.between(reduceMinutes, nowDateTime);

        System.out.println("С момента события прошло");
        System.out.println("Годы:" + years);
        System.out.println("Месяца: " + mounts);
        System.out.println("Дни: " + days);
        System.out.println("Часы: " + hours);
        System.out.println("Минуты:" + minutes);
        System.out.println("Секунды: " + second);
    }
}
