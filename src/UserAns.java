import java.io.File;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342964137
 */
public class UserAns {
    private int ans;
    private String questionType;
    private int questionNum;
    private boolean correct;
    private static int count;
    private static final String TF = "RealorFake";
    private static final String MC = "MultipleChoice";

    /**
     * Main constructor that constructs a UserAns record
     *
     * @param ans The user's answer in a int format
     * @param questionType Type of question t/f or mc
     * @param correct boolean if the answer was correct
     */
    public UserAns(int ans,String questionType, boolean correct){
        this.ans=ans;
        this.questionType=questionType; 
        this.correct=correct;
        this.questionNum= count;
        count++;
    }
    
    /**
     * method to create and store a new answer record Automatically
     * determines question type and correctness
     *
     * @param answer The user's answer in a int
     */
    public static void MakeAns(int answer){
        String qType;
        // find question type using instanceof
        if(Question.q.get(count) instanceof Real_Fake)
            qType = TF;
        else{
            qType=MC;  
        }
        // Checks answer with a stored answer
        if(answer == Question.q.get(count).getFileAns()){
           AllAns.a.add(new UserAns(answer,qType,true)); // if the answer is correct
        } else{
           AllAns.a.add(new UserAns(answer,qType,false)); // if the answer is wrong
        }
    }
    
    // gettor methods
    public int getQuestionNum(){
        return questionNum;
    }
    public boolean getCorrect(){
        return correct;
    }
    public int getAns() {
        return ans;
    }
    
    /**
     * string representation of answer data
     * @return string of answer fields
     */
    public String toString(){
        return ans+questionType+questionNum+correct;
    }
}
