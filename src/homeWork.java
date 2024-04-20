public class homeWork {
    public static void main(String[] args) {
        int a = 123;
        byte b = -127;
        short c = 10000;
        long d = 100000L;
        float e = 1.23F;
        double f = 123.4151;
        System.out.println("Значение переменной с типом int равно " + a);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + c);
        System.out.println("Значение переменной с типом long равно " + d);
        System.out.println("Значение переменной с типом float равно " + e);
        System.out.println("Значение переменной с типом double равно " + f);

        float q = 27.12F;
        float w = 987.678965549F;
        double r = 2.786;
        short t = 569;
        short y = -159;
        short u = 27897;
        byte i = 67;

        byte ludmilaClass = 23;
        byte annaClass = 27;
        byte katrineClass = 30;
        short paper = 480;
        long paperAmount = paper / (ludmilaClass + annaClass + katrineClass);
        System.out.println("Каждый ученик получит по " + paperAmount +  " листов бумаги");


        byte bottlesEveryTwoMinutes = 16;
        int bottlesPerMinute = bottlesEveryTwoMinutes / 2;
        long result1 = bottlesPerMinute * 20;
        long result2 = bottlesPerMinute * 1440;
        long result3 = result2 * 3;
        long result4 = result3 * 10;
        System.out.println("За 20 минут машина произвела " + result1 + " бутылок");
        System.out.println("За сутки машина произвела " + result2 + " бутылок");
        System.out.println("За 3 суток машина произвела " + result3 + " бутылок");
        System.out.println(" За месяц машина произвела " + result4 + " бутылок");

        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = allPaint / (whitePaint + brownPaint);
        int allWhitePaint = classes * whitePaint;
        int allBrownPaint = classes * brownPaint;
        System.out.println("В школе, где " + classes + " классов, нужно " + allWhitePaint + " банок белой краски, и " + allBrownPaint + " банок коричневой краски");

        short bananas = 80 * 5;
        short milk = 105 * 2;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        long breakfastWeight = bananas + milk + iceCream + eggs;
        System.out.println("Вес спортзавтрака - " + breakfastWeight + " грамм");
        float breakfastKgWeight = breakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака - " + breakfastKgWeight + " кг");

        short loseWeight = 7000;
        short minLoseWeightPerDay = 250;
        short maxLoseWeightPerDay = 500;
        short minDay = 7000 / 500;
        short maxDay = 7000 / 250;
        System.out.println("При похудении на 250 грамм в день необходимо " + maxDay + " дней для сброса 7 кг");
        System.out.println("При похудении на 500 грамм в день необходимо " + minDay + " дней для сброса 7 кг");

        long mashaSalary = 67760;
        long denSalary = 83690;
        long krisSalary = 76230;
        long mashaYearSalary = mashaSalary * 12;
        long denYearSalary = denSalary * 12;
        long krisYearSalary = krisSalary * 12;
        float newMashaSalary = mashaSalary * 1.1f;
        float newDenSalary = denSalary * 1.1f;
        float newKrisSalary = krisSalary * 1.1f;
        float newMashaYearSalary = newMashaSalary * 12;
        float newDenYearSalary = newDenSalary * 12;
        float newKrisYearSalary = newKrisSalary  * 12;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей, годовой доход вырос на " + (newMashaYearSalary - mashaYearSalary) + " рублей");
        System.out.println("Денис теперь получает " + newDenSalary + " рублей, годовой доход вырос на " + (newDenYearSalary - denYearSalary) + " рублей");
        System.out.println("Кристина теперь получает " + newKrisSalary + " рублей, годовой доход вырос на " + (newKrisYearSalary - krisYearSalary) + " рублей");












    }
}
