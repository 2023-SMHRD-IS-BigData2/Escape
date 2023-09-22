package model1;

public class QuizDTO {
   private String Quiz;
   private String Answer;
   private String Code;
   private String Hinteu;
   private String Object;

   public QuizDTO(String quiz, String answer, String code, String hinteu, String object) {
      super();
      Quiz = quiz;
      Answer = answer;
      Code = code;
      Hinteu = hinteu;
      Object = object;
   }

   public String getQuiz() {
      return Quiz;
   }

   public void setQuiz(String quiz) {
      Quiz = quiz;
   }

   public String getAnswer() {
      return Answer;
   }

   public void setAnswer(String answer) {
      Answer = answer;
   }

   public String getCode() {
      return Code;
   }

   public void setCode(String code) {
      Code = code;
   }

   public String getHinteu() {
      return Hinteu;
   }

   public void setHinteu(String hinteu) {
      Hinteu = hinteu;
   }

   public String getObject() {
      return Object;
   }

   public void setObject(String object) {
      Object = object;
   }

}