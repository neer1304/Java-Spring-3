/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

/**
 *
 * @author Admin
 */
public class QuizMasterService {

     QuizMaster quizMaster;

    public void setQuizMaster(QuizMaster quizMaster) {
        this.quizMaster = quizMaster;
    }

public void askQuestion()
{
System.out.println(quizMaster.popQuestion());
}

}
