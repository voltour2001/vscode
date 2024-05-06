import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<MultipleChoiceQuestion> questions = new ArrayList<>();

        // Creating question 1
        List<List<String>> answerOptions1 = new ArrayList<>();
        answerOptions1.add(List.of("Option A", "Option B", "Option C", "Option D"));
        List<List<Integer>> correctChoices1 = new ArrayList<>();
        correctChoices1.add(List.of(1, 2, 3)); //! Correct answers for Q1 are 1,2,3
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("Q1", "First question", answerOptions1, correctChoices1);
        questions.add(question1);

        // Creating question 2
        List<List<String>> answerOptions2 = new ArrayList<>();
        answerOptions2.add(List.of("Option 1", "Option 2", "Option 3", "Option 4"));
        List<List<Integer>> correctChoices2 = new ArrayList<>();
        correctChoices2.add(List.of(1, 2));  //! Correct answers for Q2 are 1,2
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("Q2", "Second question", answerOptions2, correctChoices2);
        questions.add(question2);

        // Assumed userChoices 
        List<List<Integer>> userChoices = new ArrayList<>();
        userChoices.add(List.of(1, 2, 3));   //! Answers for question 1
        userChoices.add(List.of(1,2));          //! Answers for question 2

        
        // Check question correctness
        for (int i = 0; i < questions.size(); i++) {

            MultipleChoiceQuestion question = questions.get(i);
            List<List<Integer>> correctChoices = question.getCorrectChoices();
            List<Integer> wrongIndices = Question.isCorrect(correctChoices, userChoices.subList(i, i + 1));

            if (wrongIndices.isEmpty()) {
                System.out.println("All answers are correct for question: " + question.getCode());
            } else {
                System.out.println("Incorrect answers for question: " + question.getCode() + " " + wrongIndices);
            }
        }

        scanner.close();
    }
}
