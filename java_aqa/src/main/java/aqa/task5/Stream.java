package aqa.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        IntStream.range(0, 10).forEach(i -> {
            Address addr = new Address();
            addr.setCity("City" + (i % 3));
            addr.setState("State" + (i % 2));
            addr.setZip(10000 + i);

            User u = new User();
            u.setName("User" + i);
            u.setAge(20 + i);
            u.setAddress(addr);

            users.add(u);
        });

        System.out.println("Згенеровані юзери:");
        users.forEach(System.out::println);
        System.out.println("____");

        System.out.println("Посортовані (name + city):");
        users.stream()
                .sorted(
                        Comparator.comparing(User::getName)
                                .thenComparing(u -> u.getAddress().getCity())
                )
                .forEach(System.out::println);
        System.out.println("____");

        System.out.println("Пофільтровані (age > 25 + City1):");
        List<User> filtered = users.stream()
                .filter(u -> u.getAge() > 25)
                .filter(u -> "City1".equals(u.getAddress().getCity()))
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
        System.out.println("____");

        List<String> names = users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
        System.out.println("Імена: " + names);

        if (args.length > 0) {
            System.out.println("Args[0] = " + args[0]);
        }
    }
}
