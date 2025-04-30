public class Main {
    public static void main(String[] args) {
    System.out.println("Hello and welcome!");
    int age = 15;

    System.out.print("Если возраст человека равен " + age + ", то ");
    if (age >= 18) {
            System.out.println("он совершеннолетний");
    }else {System.out.println("он не достиг совершеннолетия");}

    float temp = 24.4f;
    boolean tempOutdoor = (temp > 5);

    System.out.print("По прогнозу погоды сегодня " + temp + " градусов. ");

    if (tempOutdoor) {
            System.out.println("На улице тепло, можно идти без шапки.");
    }else System.out.println("На улице прохладно, советуем надеть шапку.");

    float speed = 54.3f;

    System.out.print("Если скорость движения автомобиля равна " + speed + ", то ");

    if (speed > 60) {System.out.println("нужно будет заплатить штраф.");}
    if (speed < 60) {System.out.println("вы двигаетесь согласно правилам дорожного движения.");}
    if (speed == 60) {System.out.println("вы двигаетесь согласно правилам, но вам следует сбавить скорость.");}

    boolean childAge = (age >= 2 && age <= 4);
    boolean childAge2 = (age == 5 || age == 6);
    boolean teenAge = (age >= 7 && age <= 17);
    boolean youngAge = (age >= 18 && age <= 24);
    boolean adultAge = (age > 24);

    System.out.print("Если человеку на данный момент " + age );

    if (age == 1|| age == 0) {
        System.out.println(", то зачем ты вообще об этом спрашиваешь?");
    }else if (childAge) {
        System.out.print(" года, то ");
    }else System.out.print(" лет, то ");

    if (childAge||childAge2) {System.out.println("его следует водить в детский сад.");}
    if (teenAge) {System.out.println("ему следует ходить в школу.");}
    if (youngAge) {System.out.println("ему следует ходить в университет.");}
    if (adultAge) {System.out.println("ему следовало бы ходить на работу, но он волен делать что хочет.");}

    boolean noGameAge = (age < 5);
    boolean childGameAge = (age >=5 && age <= 14);
    boolean adultGameAge = (age > 14);

    System.out.print("Если ребёнку " + age);

    if (age== 1|| age ==0) {
        System.out.println(", то зачем ты вообще об этом спрашиваешь?");
    }else if (noGameAge) {System.out.println(" года, то ему нельзя кататься на аттракционах.");}
    if (childGameAge) {System.out.println(" лет, то он может кататься на аттракционе ТОЛЬКО в сопровождении взрослых.");}
    if (adultGameAge) {System.out.println(" лет, то ему можно посещать аттракционы без ограничений.");}

    byte allSeat = 102;
    byte seatSit = 60;
    int seatStand = (byte) allSeat - seatSit;

    byte sittingPeople = 60;
    byte standingPeople = 42;
    int allPeople = (short) sittingPeople + standingPeople;

    System.out.println("Вас приветствует наше любимое РЖД!");

    boolean canBuy = (allPeople < allSeat);

    if (!canBuy) {
        System.out.println("Сожалеем, но все места заняты, проверьте позднее или рассмотрите другие маршруты.");
    }else
        if (sittingPeople < seatSit) {
            System.out.println("Вы можете приобрести билет на сидячее место.");}
        if (standingPeople < seatStand)
            {System.out.println("Вы можете приобрести билет на стоячее место.");}

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее.");
        }else if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее.");
        }else if (three > one && three > two)
            {System.out.println("Число " + three + " наибольшее.");}
    }
}