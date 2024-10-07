public class Main {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");

        }
        int temper = 7;
        if (temper >= 5) {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temper + " градусов, нужно надеть шапку");

        }
        int speed = 120;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то, придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ехать спокойно");
        }
        int age2 = 27;
        if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен " + age2 + " то, ему нужно ходить в детский сад");
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + " то, ему нужно ходить в школу");
        }
        if (age2 >= 18 && age2 <=24 ) {
            System.out.println("Если возраст человека равен " + age2 + " то, ему нужно ходить в университет или институт");
        }
        if (age2 > 24) {
            System.out.println("Если человеку уже " + age2 + " прощай беспечная жизнь");
        }
        int age3 = 15;
        if (age3 <= 5) {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то ему нельзя кататься на аттракционе");
        }
        if (age3 > 5 && age3 <= 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то ему можно кататься на аттракционе, в сопровождении взрослого");
        }
        if (age3 > 14) {
            System.out.println("Если возраст ребенка равен " + age3 + " ,то ему можно кататься на аттракционе, без сопровождения взрослого");
        }
        int PurchaseTicketNumber = 103;
        if (PurchaseTicketNumber <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (PurchaseTicketNumber > 60 && PurchaseTicketNumber <= 102) {
            System.out.println("В вагоне остались стоячие места");
        } else {
            System.out.println("Все места проданы");
        }
        int one = 92;
        int two = 987;
        int three = 132;
        if (one > two && one > three) {
            System.out.println("Самое большое число " + one + " ");
        }
        else if (two > one && two > three) {
            System.out.println("Самое большое число " + two + " ");
        }
        else if (three > one && three > two) {
            System.out.println("Самое большое число " + three + " ");
        }
}}

