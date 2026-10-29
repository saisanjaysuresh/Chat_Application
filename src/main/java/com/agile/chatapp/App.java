
package com.agile.chatapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final List<String> messages = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Chat App V1: Send Message ===");

        while (true) {
            System.out.print("Enter a message (or type 'exit' to quit): ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            if (message.trim().isEmpty()) {
                System.out.println("Message cannot be empty.");
                continue;
            }

            messages.add(message);
            System.out.println("Message sent successfully!");
        }

        System.out.println("\nChat App closed.");
        scanner.close();
    }
}
