
package com.agile.chatapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final List<String> messages = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Chat App V3: Delete Messages ===");

        while (true) {
            System.out.println("\n1. Send Message");
            System.out.println("2. View Messages");
            System.out.println("3. Delete Message");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter message: ");
                    String message = scanner.nextLine();

                    if (message.trim().isEmpty()) {
                        System.out.println("Message cannot be empty.");
                    } else {
                        messages.add(message);
                        System.out.println("Message sent successfully!");
                    }
                    break;

                case "2":
                    System.out.println("\n--- All Messages ---");
                    if (messages.isEmpty()) {
                        System.out.println("No messages available.");
                    } else {
                        for (int i = 0; i < messages.size(); i++) {
                            System.out.println((i + 1) + ". " + messages.get(i));
                        }
                    }
                    break;

                case "3":
                    if (messages.isEmpty()) {
                        System.out.println("No messages available to delete.");
                    } else {
                        System.out.println("\n--- All Messages ---");
                        for (int i = 0; i < messages.size(); i++) {
                            System.out.println((i + 1) + ". " + messages.get(i));
                        }

                        System.out.print("Enter message number to delete: ");
                        String input = scanner.nextLine();

                        try {
                            int number = Integer.parseInt(input);

                            if (number >= 1 && number <= messages.size()) {
                                messages.remove(number - 1);
                                System.out.println("Message deleted successfully!");
                            } else {
                                System.out.println("Invalid message number.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter a valid number.");
                        }
                    }
                    break;

                case "4":
                    System.out.println("Chat App closed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
