package src.basic;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class Dates {
  public static void main(String... args){

    System.out.println("LocalTime time = LocalTime.of(11,00)");
    LocalTime time = LocalTime.of(16,00,00);

    System.out.println("LocalDate date = LocalDate.of(1986,8,22)");
    LocalDate date = LocalDate.of(1986,8,22);

    System.out.println("LocalDateTime dateTime = LocalDateTime.of(date,time)");
    LocalDateTime dateTime = LocalDateTime.of(date,time);
    System.out.println();
    System.out.println("dateTime:");
    System.out.println();
    System.out.println(dateTime);

    System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)");
    DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
    System.out.println();
    System.out.println("dateTime.format(shortF)");
    System.out.println(dateTime.format(shortF));
    System.out.println();
    System.out.println("shortF.format(dateTime)");
    System.out.println(shortF.format(dateTime));
    System.out.println();

    System.out.println("DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)");
    DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    System.out.println();
    System.out.println("dateTime.format(mediumF)");
    System.out.println(dateTime.format(mediumF));
    System.out.println();
    System.out.println("mediumF.format(dateTime)");
    System.out.println(mediumF.format(dateTime));
    System.out.println();

    System.out.println("DateTimeFormatter.ofPattern(\"YYYY MMMM dd HH:mm\")");
    DateTimeFormatter patternF = DateTimeFormatter.ofPattern("YYYY MMMM dd HH:mm");
    System.out.println();
    System.out.println("dateTime.format(patternF)");
    System.out.println(dateTime.format(patternF));
    System.out.println();
    System.out.println("patternF.format(dateTime)");
    System.out.println(patternF.format(dateTime));
    System.out.println();

    LocalDate now = LocalDate.now();
    Period howOld = Period.between(now, date);
    System.out.println("Years: "+howOld.getYears());
    System.out.println("Months: "+howOld.getMonths());
    System.out.println("Days: "+howOld.getDays());
    long p1 = ChronoUnit.YEARS.between(now, date);
    System.out.println("Years: "+p1);
    long p2 = ChronoUnit.MONTHS.between(now, date);
    System.out.println("Months: "+p2);
    long p3 = ChronoUnit.DAYS.between(now, date);
    System.out.println("Days: "+p3);

    System.out.println("DaysTo power30 of 2: "+now.plusDays(326));

    LocalDateTime now2 = LocalDateTime.now();
    Duration howOldPrecise = Duration.between(now2, dateTime);
    // System.out.println("Years: "+howOldPrecise.getHours());
    // System.out.println("Months: "+howOldPrecise.getMinutes());
    // System.out.println("Days: "+howOldPrecise.getSeconds());
    long p4 = ChronoUnit.HOURS.between(now2, dateTime);
    System.out.println("Hours: "+p4);
    long p5 = ChronoUnit.MINUTES.between(now2, dateTime);
    System.out.println("Minutes: "+p5);
    long p6 = ChronoUnit.SECONDS.between(now2, dateTime);
    System.out.println("Seconds: "+p6);
    long powerOf2 = 1073741824 +p6;

    System.out.println(powerOf2/60/60/24);
    // System.out.println(ChronoUnit.SECONDS.toHours(seconds) - (day *24));
  }
}
