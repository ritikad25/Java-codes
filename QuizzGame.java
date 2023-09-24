package mycode;
import java.util.Scanner;

public class QuizzGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            //"What is the capital of India?",
            "What is the largest planet in the solar system?",
            "Who painted Mona Lisa?",
            "What is chemical symbol for hydrogen?",
            "What is the Capital of India?",
            "Who was the first president of India?"   
        };

        String[] choices = {
            "A) Earth    B) Jupiter    C) Saturn    D) Mars",
            "A) Michelangelo    B) Raphael   C) Leonardo vinci    D) Donatello",
            "A)	H   B) K    C) C    D) He",
            "A)	Mumbai   B) Kolkata    C) Surat    D) New Delhi",
            "A)	Ram Nath Kovind B) A.P.J.Abdul Kalam C) Dr.Rajendra Prasad D) Zakir Husain",
        };

        int[] correctAnswers = {2, 3, 1, 4, 3}; // Index of the correct answer (starting from 1)

        int totalQuestions = questions.length;
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println(choices[i]);

            System.out.print("Enter your choice (A/B/C/D): ");
            char userChoice = scanner.next().toUpperCase().charAt(0);

            int userAnswerIndex = userChoice - 'A' + 1;

            if (userAnswerIndex >= 1 && userAnswerIndex <= 4) {
                if (userAnswerIndex == correctAnswers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + (char) ('A' + correctAnswers[i] - 1));
                }
            } else {
                System.out.println("Invalid choice. Skipping question.");
            }
        }
        System.out.println("\nQuiz completed! Your score: " + score + "/" + totalQuestions);
		scanner.close();
	}
}