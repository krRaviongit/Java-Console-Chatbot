import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chatbot: Hi! Ask me anything or type 'bye' to exit.");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter writer = new PrintWriter(System.out, true)) {

            String input;

            while (true) {
                writer.print("You: "); 
                writer.flush(); 
                input = reader.readLine(); 

                if (input.equalsIgnoreCase("bye")) {
                    writer.println("Chatbot: Goodbye! Have a great day!");
                    break; 
                }

                
                switch (input.toLowerCase()) {
                    case "hi":
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
