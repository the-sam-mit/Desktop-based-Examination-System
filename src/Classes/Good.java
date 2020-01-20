
package Classes;

import java.util.ArrayList;

public class Good extends Question{

    private String content;
    private ArrayList<String> options;
    private int correctResponse;
    private int selectedAnswer;
    private boolean isAttempted;
    
    
    
    public Good(String _content,ArrayList<String> _options,int _correctResponse){
        
        super(1,_content);

        this.content = _content;
        this.options = _options;
        this.correctResponse = _correctResponse;
        this.isAttempted = false;
    
    }

    public String getContent() {
        return content;
    }

    public int getCorrectResponse() {
        return correctResponse;
    }
    
    public String getOption(int index){
        return options.get(index);
    }
    
    public int getSelectedAnswer() {
        return this.selectedAnswer;
    }
    
    public void setSelectedAnswer(int _selectedAnswer){
        this.selectedAnswer = _selectedAnswer;
    }
    
    
}
