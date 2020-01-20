
package Classes;

import java.util.ArrayList;

public class Tough extends Question{
    
    private String content;
    private int correctResponse;
    private int selectedAnswer;
    
    public Tough(String _content,int _correctResponse){
        super(2,_content);
        this.content = _content;
        this.correctResponse = _correctResponse;
    }

    public String getContent() {
        return content;
    }

    public int getCorrectResponse() {
        return correctResponse;
    }
    
    public String getOption(int index){
        return "end";
    }
    
    public int getSelectedAnswer() {
        return selectedAnswer;
    }
    
    public void setSelectedAnswer(int _selectedAnswer){
        
        this.selectedAnswer = _selectedAnswer;
    }
}
