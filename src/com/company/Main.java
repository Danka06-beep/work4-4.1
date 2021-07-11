package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Сортировка по убыванию цены");
        System.out.println("2. Сортировка по возрастанию цены");
        System.out.println("3. Сортировка по приоритету от самого важного");
        System.out.println("4. Сортировка по приоритету от низкого приоритета");
        System.out.println("Введите идентификатор сортировки:");
       int id = sc.nextInt();
        extracted(id, outpat());
    }

    private static void extracted(int id,  ArrayList<Wish>kj) {
        TreeSet<Wish> users;
        switch (id) {
            case (1):
                users = new TreeSet<>(Comparator.comparing(u -> u.getPrice(),Comparator.reverseOrder()));
                users.addAll(kj);
                wiwod(users);
                break;
            case (2):
              users = new TreeSet<>(Comparator.comparing(u -> u.getPrice()));
                users.addAll(kj);
                wiwod(users);
                break;
            case (3):
                 users = new TreeSet<>(Comparator.comparing(u -> u.getPrioritet(),Comparator.reverseOrder()));
                users.addAll(kj);
                wiwod(users);
                break;
            case (4):
                 users = new TreeSet<>(Comparator.comparing(u -> u.getPrioritet()));
                users.addAll(kj);
                wiwod(users);
                break;
            default:
                break;
        }
    }

    public static ArrayList<Wish> outpat() {
        ArrayList<Wish> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(new Wish("john" + i, "long" + i, 15*i, "addres" + i, i));
        }
        return list;
    }
    public static void wiwod(TreeSet<Wish> kl){
        for(Wish wish : kl){
            System.out.println(wish);
        }
    }
}
