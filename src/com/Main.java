package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Operations operations = new Operations();

        Scanner in = new Scanner(System.in);
        System.out.println("1.Bidirectional cyclic list create:");
        System.out.println("Enter size:");

        int size = in.nextByte();
        System.out.println("Enter numbers:");

        for (int i = 0; i < size; i++) {
            char el = in.next().charAt(0);
            operations.addLast(el);
        }
        System.out.println(" Queue list:");
        operations.print();

        System.out.println("\nActions: \npress number \n1(add number) \n2(delete number) \n3(twins queue)" +
                "\n4(show first element) \n5(show sum elements)");
        while (true) {
            int action = in.nextByte();
            if (action == 1) {
                System.out.println("Enter number:");
                char el = in.next().charAt(0);
                operations.addLast(el);

                System.out.println("Create  numbers:");
                System.out.println("Update Queue:");
                operations.print();
            }
            else if (action == 2) {

                System.out.println("\nDelete  number:");
                operations.deleteFirst();
                System.out.println("Update list:");
                operations.print();
            }
            else if (action == 3) {
                operations.twiced();
            }
            else if(action==4) {
                operations.showFirst();
            }
            else if(action==5) {
                operations.sum();
            }
        }

    }
}
