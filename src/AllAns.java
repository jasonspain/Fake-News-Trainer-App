
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342964137
 */
public class AllAns {
    private static int longestStreak = 0;
    private static int currStreak = 0;
    
    public static ArrayList<UserAns> a = new ArrayList<UserAns>();
    
    public static int setStreak(){
        for(int i = 0; i < AllAns.a.size(); i++){
        UserAns answer = AllAns.a.get(i);
        if(answer.getCorrect()){
            currStreak++;
            if (currStreak > longestStreak){
            longestStreak = currStreak;
            }
        } else{
            currStreak = 0;
        }
    }
    return longestStreak;
    }
    
    public static String displayWrongAns(){
        StringBuilder wrongAnswers = new StringBuilder();
        for (int i = 0; i < AllAns.a.size(); i++) {
            UserAns answer = AllAns.a.get(i);
            if (!answer.getCorrect()) {
                Question question = Question.q.get(i);
                wrongAnswers.append("Question ").append(i + 1).append(": ")
                        .append(question.getQuestion()).append("\n")
                        .append("Your answer: ").append(answer.getAns()).append("\n")
                        .append("Correct answer: ").append(question.getFileAns()).append("\n\n");
            }
        }
        return wrongAnswers.toString();
    }
    
    public static void WriteWrongAnstoFile(){
        try {
            FileWriter w = new FileWriter("UserAnswers.txt", false);
            w.write("");
        } catch (IOException e) {
        }
        
        for(int i = 0; i < AllAns.a.size(); i++){
            UserAns answer = AllAns.a.get(i);
        if(answer.getCorrect()){
            currStreak++;
            if (currStreak > longestStreak){
                longestStreak = currStreak;
            }
        } else {
            currStreak = 0;
            try {
                FileWriter w = new FileWriter("UserAnswers.txt", true);
                Question question = Question.q.get(i);
                w.append("Question ").append(String.valueOf(i + 1)).append(": ")
                  .append(question.getQuestion()).append("\n")
                  .append("Your answer: ").append(String.valueOf(answer.getAns())).append("\n")
                  .append("Correct answer: ").append(String.valueOf(question.getFileAns())).append("\n\n");
            } catch (IOException e) {
            }
        }
    }
    }
}
