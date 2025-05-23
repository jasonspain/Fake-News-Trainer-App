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
    private static final String tf = "RealorFake";
    private static final String mc = "MultipleChoice";

    
    public UserAns(int ans,String questionType, boolean correct){
        this.ans=ans;
        this.questionType=questionType; 
        this.correct=correct;
        this.questionNum= count;
        count++;
    }
    
    
    public static void MakeAns(int answer){
        String qType;
        if(Question.q.get(count) instanceof Real_Fake)
            qType = tf;
        else{
            qType=mc;  
        }
        if(answer == Question.q.get(count).getFileAns()){
           AllAns.a.add(new UserAns(answer,qType,true));   
        } else{
           AllAns.a.add(new UserAns(answer,qType,false));
        }
    }
    
    public int getQuestionNum(){
        return questionNum;
    }
    public boolean getCorrect(){
        return correct;
    }
    
    @Override
    public String toString(){
        return ans+questionType+questionNum+correct;
    }
}
