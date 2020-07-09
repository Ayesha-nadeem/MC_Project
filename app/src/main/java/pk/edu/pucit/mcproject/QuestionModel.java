package pk.edu.pucit.mcproject;

public class QuestionModel {
    private String question,optiona,optionb,optionc,optiond,correctanswer;

    public QuestionModel(String optiona, String optionb, String optionc, String optiond, String correctanswer,String question) {
        this.optiona = optiona;
        this.optionb = optionb;
        this.optionc = optionc;
        this.optiond = optiond;
        this.correctanswer = correctanswer;
        this.question = question;

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptiona(String optiona) {
        this.optiona = optiona;
    }

    public void setOptionb(String optionb) {
        this.optionb = optionb;
    }

    public void setOptionc(String optionc) {
        this.optionc = optionc;
    }

    public void setOptiond(String optiond) {
        this.optiond = optiond;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptiona() {
        return optiona;
    }

    public String getOptionb() {
        return optionb;
    }

    public String getOptionc() {
        return optionc;
    }

    public String getOptiond() {
        return optiond;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }
}
