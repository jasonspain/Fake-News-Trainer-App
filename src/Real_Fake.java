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
 * Gets the information of a real or fake question. Child of the Question class
 */
public class Real_Fake extends Question{
    /**
     * Main Constructor that constructs a Real_Fake question with the specified
     * parameters.
     *
     * @param img image identifier or name 
     * @param Question The text of the question to be displayed
     * @param fileAns The correct answer in a int form
     */
    public Real_Fake(String img,String Question, int fileAns){
        super(img,Question,fileAns);
    }
}
