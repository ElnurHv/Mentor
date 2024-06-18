package Lesson_11.TimeCalculator;

public class TimeCalculator {
    public void calculate(int hour1, int minute1, int hour2, int minute2) {
        if (minute2 < minute1) {
            minute2 += 60;
            int totalMinute = minute2 - minute1;

            hour2--;
            int totalHour = hour2 - hour1;
            System.out.println(" There is " + totalHour + " hour " + totalMinute + " minutes diffrence");
        }

    }

    public void calculate(String time1, String time2) {

        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");

        int hour1 = Integer.parseInt(parts1[0]);
        int minute1 = Integer.parseInt(parts1[1]);
        int hour2 = Integer.parseInt(parts2[0]);
        int minute2 = Integer.parseInt(parts2[1]);

        if (hour1 < 0 || hour1 > 23 || minute1 < 0 || minute1 > 59 ||
                hour2 < 0 || hour2 > 23 || minute2 < 0 || minute2 > 59) {
            System.out.println("invalid time ");


        }else if (minute2 < minute1) {
                minute2 += 60;
                int totalMinute = minute2 -= minute1;

                hour2--;
                int totalHour = hour2 - hour1;
                System.out.println(" There is " + totalHour + " hour " + totalMinute + " minutes diffrence");


            }
        }


            public static void main (String[]args){
                TimeCalculator time = new TimeCalculator();
                time.calculate(10, 30, 14, 15);
                 time.calculate ("45:30","18:00");
            }


        }

