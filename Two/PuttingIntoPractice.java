package Two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // 1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        System.out.println("Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).");
        transactions.stream()
                    .filter((item)->(item).getYear() == 2011)
                    .sorted(Comparator.comparingInt(Transaction::getValue))
                    .forEach(System.out::println);
                    
        // 2. Вывести список неповторяющихся городов, в которых работают трейдеры.
        System.out.println("\nВывести список неповторяющихся городов, в которых работают трейдеры.");
        transactions.stream()
                    .map((item)->item.getTrader().getCity())
                    .distinct()
                    .forEach(System.out::println);

        // 3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.
        System.out.println("\nНайти всех трейдеров из Кембриджа и отсортировать их по именам.");
        transactions.stream()
                    .filter((item)->item.getTrader().getCity() == "Cambridge")
                    .sorted((itemOne,itemTwo)->itemOne.getTrader().getName().compareTo(itemTwo.getTrader().getName()))
                    .forEach(System.out::println);
        // 4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        System.out.println("\nВернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.");
        String strName = transactions.stream()
                        .map((item)->item.getTrader().getName())
                        .sorted((itemOne,itemTwo)->itemOne.compareTo(itemTwo))
                        .collect(Collectors.joining(", ")); 
        System.out.println(strName);
        // 5. Выяснить, существует ли хоть один трейдер из Милана.
        System.out.println("\nВыяснить, существует ли хоть один трейдер из Милана.");
        Boolean isPlace = transactions.stream()
                    .anyMatch((item)->item.getTrader().getCity() == "Milan");
        System.out.println("Милан хоть одни есть: "+isPlace);
        // 6. Вывести суммы всех транзакций трейдеров из Кембриджа.
        System.out.println("\nВывести суммы всех транзакций трейдеров из Кембриджа.");
        transactions.stream()
                    .filter((item)->item.getTrader().getCity() == "Cambridge")
                    .map((item)->item.getValue())
                    .forEach(System.out::println);
        // 7. Какова максимальная сумма среди всех транзакций?
        System.out.println("\nКакова максимальная сумма среди всех транзакций?");
        Number maxSum = transactions.stream()
                    .map((item)->item.getValue())
                    .max(Integer::compare)
                    .get();
        System.out.println("Максимальная сумма: "+maxSum);
        // 8. Найти транзакцию с минимальной суммой.
        System.out.println("\nНайти транзакцию с минимальной суммой.");
        Transaction minSum = transactions.stream()
                    .min((itemOne,itemTwo)->Integer.compare(itemOne.getValue(), itemTwo.getValue()))
                    .get();
        System.out.println("Минимальная сумма: "+minSum);


    }
}