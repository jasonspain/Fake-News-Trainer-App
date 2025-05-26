import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342964137
 */
/**
 * Finds a quiz question with its associated image, text, and correct
 * answer. Manages loading questions from file and controlling questions order in
 * the quiz.
 */
public class Question {
    private String img;
    private String Question;
    private int fileAns;
    public static ArrayList<Question> q = new ArrayList<Question>();
    public static int count = 0;
    
    /**
     * Default constructor
     */
    public Question(){
        this.img="n/a";
        this.Question="n/a";
        this.fileAns=-1;  
    }
    
    /**
     * Overloaded constructor
     *
     * @param img image path/name
     * @param Question the question text
     * @param fileAns Correct answer (int)
     */
    public Question(String img,String Question, int fileAns){
        this.img=img;
        this.Question=Question;
        this.fileAns=fileAns;
    }
    
    // Gettor methods
    public String getImg(){
        return img;
    }
    
    public String getQuestion(){
        return Question;
    }
    
    public int getFileAns(){
        return fileAns;
    }
    
    /**
     * Loads questions from "Questions.txt" file into the array list.
     * Finds out question type (MultipleChoice or Real_Fake) based on line
     * format in the text file.
     */
    public static void writeToQuestion(){
        try{
            Scanner fileInput = new Scanner(new File("Questions.txt"));
            while(fileInput.hasNextLine()){
              String [] info = fileInput.nextLine().split(",");
              if(info.length>3){
                  // MultipleChoice questions have >3 fields
                  q.add(new MultipleChoice(info[0],info[1],Integer.parseInt(info[2]),info[3],info[4],info[5],info[6]));
              }else{
                  // Real_Fake questions only have 3 fields
                  q.add(new Real_Fake(info[0],info[1],Integer.parseInt(info[2])));
              }
            }
            fileInput.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
    /**
     * Moves on to the next question or shows results if quiz is complete.
     * Finds corresponding question frame based on question type.
     */
    public static void nextQuestion(){
        // Show results after 10 questions
        if (count >= 10) {
            new ResponseFrame().setVisible(true);
            return;
        }
        // Get current question number from answers
        int currentAns = AllAns.a.get(AllAns.a.size() - 1).getQuestionNum();
        if(q.get(currentAns+1) instanceof Real_Fake){
            new QuestionFrame().setVisible(true); // Real or fake question frame
        }else{
            new Question2Frame().setVisible(true); // Multiple choice frame
        }
    }
    
    /**
     * string representation of the question
     *
     * @return string of question fields
     */  
    @Override
    public String toString(){
        return img+Question+fileAns;
    }
    
  
}
