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
public class Question {
    private String img;
    private String Question;
    private int fileAns;
    public static ArrayList<Question> q = new ArrayList<Question>();
    
    public Question(String img,String Question, int fileAns){
        this.img=img;
        this.Question=Question;
        this.fileAns=fileAns;
    }
    
    public String getImg(){
        return img;
    }
    
    public String getQuestion(){
        return Question;
    }
    
    public int getFileAns(){
        return fileAns;
    }
    
    public static void writeToQuestion(){
        try{
            Scanner fileInput = new Scanner(new File("Questions.txt"));
            while(fileInput.hasNextLine()){
              String [] info = fileInput.nextLine().split(",");
              if(info.length>3){
                  q.add(new MultipleChoice(info[0],info[1],Integer.parseInt(info[2]),info[3],info[4],info[5],info[6]));
              }else{
                  q.add(new Real_Fake(info[0],info[1],Integer.parseInt(info[2])));
              }
            }
            fileInput.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
            
    @Override
    public String toString(){
        return img+Question+fileAns;
    }
    
  
}
