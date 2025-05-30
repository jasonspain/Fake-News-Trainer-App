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
 * This class represents a multiple-choice question with four possible answers. Child of the
 * Question class.
 */
public class MultipleChoice extends Question{
    // the choices
    private String choice1;
    private String choice2;
    private String choice3;
    private String choice4;
   
    /**
     * Main constructor that constructs a MultipleChoice question with all the choices
     * @param img name of image
     * @param Question The question text
     * @param fileAns correct answer index (1-4)
     * @param choice1 first answer choice
     * @param choice2 second answer choice
     * @param choice3 third answer choice
     * @param choice4 fourth answer choice
     */
    public MultipleChoice(String img,String Question, int fileAns,String choice1,String choice2,String choice3,String choice4){
       super(img,Question,fileAns);
       this.choice1=choice1;
       this.choice2=choice2;
       this.choice3=choice3;
       this.choice4=choice4;
    }
    
    // Gettor methods
    public String getChoice1(){
        return choice1;
    }
    
    public String getChoice2(){
        return choice2;
    }
    
    public String getChoice3(){
        return choice3;
    }
    
    public String getChoice4(){
        return choice4;
    }
    
    /**
     * Returns a string representation of Question and
     * the multiple choice options
     *
     * @return string of the question data
     */
    @Override
    public String toString(){
      return super.toString()+choice1+choice2+choice3+choice4;
    }
}
