import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "what lang", "java", "cpp", "python", "csharp", "java");
        questions[1] = new Question(2, "what name", "kri", "cpp", "python", "csharp", "kri");
        questions[2] = new Question(3, "what project", "guide", "cpp", "python", "csharp", "guide");
        questions[3] = new Question(4, "what time", "1 year", "cpp", "python", "csharp", "1 year");
        questions[4] = new Question(5, "what goal", "startup", "cpp", "python", "csharp", "startup");

    }

    public void playQuiz()
    {
        int i=0;
        for(Question q : questions){

            System.out.println();
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner (System.in);
            selection[i] = sc.nextLine();
            i++;
    }
    for(String s : selection)
    {
        System.out.println(s);
    }
    }
    public void printScore()
    {
        int score = 0;
        for(int i=0; i<questions.length;i++)
        {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("your score is:" + score);
    }
}
   

