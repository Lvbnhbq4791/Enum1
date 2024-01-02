
public class Main {
    public static void main(String[] args) {
        ScholarSchedule schedule = new ScholarSchedule();
        schedule.setDayOfWeek(DayOfWeek.MONDAY);
        Scholar scholar = new Scholar(schedule);
        scholar.wakeUp();
        System.out.println(DayOfWeek.FRIDAY.getTitle());
    }
}
