public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            var dog = 8;
            System.out.println(dog);
        }
        {
            var cat = 3.6;
            System.out.println(cat);
        }
        {
            var paper = 763789;
            System.out.println(paper);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        {
            var dog = 8;
            dog = dog + 4;
            System.out.println(dog);
        }
        {
            var cat = 3.6;
            cat = cat + 4;
            System.out.println(cat);
        }
        {
            var paper = 763789;
            paper = paper + 4;
            System.out.println(paper);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        {
            var dog = 8;
            var epta = 3.5;
            var pipec = dog - epta;
            System.out.println(pipec);
        }
        {
            var cat = 3.6;
            cat = cat - 1.6;
            System.out.println(cat);
        }
        {
            var paper = 763789;
            paper = paper - 7639;
            System.out.println(paper);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        {
            var friend = 19;
            System.out.println(friend);
            friend = friend * 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        {
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        {
            var WeightFirstFighter = 78.2;
            var WeightSecondFighter = 82.7;
            var TotalWeightFighters = WeightFirstFighter + WeightSecondFighter;
            System.out.println("Общий вес двух бойцов " + TotalWeightFighters + " кг!");
            var WeightDifference = WeightSecondFighter - WeightFirstFighter;
            System.out.println("Разница между весами бойцов " + WeightDifference + " кг!");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        {
            var WeightFirstFighter = 78.2;
            var WeightSecondFighter = 82.7;
            var WeightDifference = WeightSecondFighter - WeightFirstFighter;
            System.out.println("Разница между весами бойцов " + WeightDifference + " кг!");
            var WeightDifference2 = WeightSecondFighter % WeightFirstFighter;
            System.out.println("Разница между весами бойцов " + WeightDifference2 + " кг!");
            }
    }

    public static void task8() {
        System.out.println("Задача 8");
        {
            var TotalTameWork = 640;
            var WorkingHours = 8;
            var HowManyWorkers = TotalTameWork / WorkingHours;
            System.out.println("Всего работников в компании " + HowManyWorkers + " Человек.");
            var IncreaseEmployees = HowManyWorkers + 94;
            var TotalTameWork2 = IncreaseEmployees * WorkingHours;
            System.out.println("Если в компании работает " + IncreaseEmployees + " человек, то всего " + TotalTameWork2 + " часов работы может быть  поделено между сотрудниками.");
        }
    }
}