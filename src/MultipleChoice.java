/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342964137
 */
public class MultipleChoice extends Question{
   private String choice1;
   private String choice2;
   private String choice3;
   private String choice4;
   
   public MultipleChoice(String img,String Question, int fileAns,String choice1,String choice2,String choice3,String choice4){
       super(img,Question,fileAns);
       this.choice1=choice1;
       this.choice2=choice2;
       this.choice3=choice3;
       this.choice4=choice4;
   }
   
   @Override
   public void getFileAns(){
       
   }
}
