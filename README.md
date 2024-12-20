# Java-Console-Chatbot
# Chatbot: A Simple Interactive Console Program

## Overview
This is a simple chatbot program built in Java. It allows users to interact with the chatbot through the console. The chatbot responds to predefined inputs and exits the conversation when the user types `bye`.

## Features
- Interactive console-based chatbot.
- Recognizes specific inputs like "hello," "how are you?", and "what is Java?".
- Ends the conversation gracefully when the user types `bye`.
- Handles unexpected inputs with a default response.

## How It Works
1. The program starts by greeting the user.
2. Users can type messages, and the chatbot responds based on predefined logic.
3. If the user types "bye," the program terminates with a goodbye message.

## Example Interaction
```
Chatbot: Hi! Ask me anything or type 'bye' to exit.
You: hello
Chatbot: Hello! How can I help you?
You: how are you?
Chatbot: I'm just a program, but I'm doing great! Thanks for asking.
You: what is java?
Chatbot: Java is a popular programming language used for building applications.
You: bye
Chatbot: Goodbye! Have a great day!
```

## Prerequisites
- Java Development Kit (JDK) installed (version 8 or later).
- IDE or terminal to run the Java program.

## How to Run
1. Clone the repository or download the source code.
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse) or compile it using the terminal.
3. Run the `Chatbot` program.

### Using Terminal
```bash
javac Chatbot.java
java Chatbot
```

## Code
```java
import java.io.*;

public class Chatbot {
    public static void main(String[] args) {
        System.out.println("Chatbot: Hi! Ask me anything or type 'bye' to exit.");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(System.out, true)) {

            String input;

            while (true) {
                writer.print("You: "); // Prompt for user input
                writer.flush(); // Ensure the "You: " appears immediately
                input = reader.readLine(); // Read user input

                if (input.equalsIgnoreCase("bye")) {
                    writer.println("Chatbot: Goodbye! Have a great day!");
                    break; // Exit the loop
                }

                // Basic responses
                switch (input.toLowerCase()) {
                    case "hello":
                        writer.println("Chatbot: Hello! How can I help you?");
                        break;
                    case "how are you?":
                        writer.println("Chatbot: I'm just a program, but I'm doing great! Thanks for asking.");
                        break;
                    case "what is java?":
                        writer.println("Chatbot: Java is a popular programming language used for building applications.");
                        break;
                    default:
                        writer.println("Chatbot: I'm not sure how to answer that.");
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
```





