package ch2;

public class meaningfulContext {

   public static void main(String[] args) {

//     pringGuessStatistics('a', 0);
     GuessStatisticsMessage message = new GuessStatisticsMessage();
     System.out.println(message.make('z', 0));
     System.out.println(message.make('z', 1));
     System.out.println(message.make('ㅣz', 2));

   }

   //목록 2-1 맥락이 불분명한 변수
   private static void pringGuessStatistics(char candidate, int count){

      String number;
      String verb;
      String pluralModifier;


      if(count == 0){

         number = "no";
         verb = "are";
         pluralModifier = "s";

      } else if(count == 1){

         number = "1";
         verb = "is";
         pluralModifier = "";

      } else {

         number = Integer.toString(count);
         verb = "are";
         pluralModifier = "s";
      }

      String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
      System.out.println(guessMessage);
   }

}

class GuessStatisticsMessage{

   private String number;
   private String verb;
   private String pluralModifier;

   public String make(char candidate, int count){
     createPluraDependentMessageParts(count);
     return String.format(
             "There %s %s %s%s",
             verb, number, candidate, pluralModifier);
  }

   private void createPluraDependentMessageParts(int count){

     if(count == 0){
        thereAreNoLetters();
     } else if(count == 1){
        thereIsOneLetter();
     } else{
         thereAreManyLetters(count);
     }
   }

   private void thereAreManyLetters(int count){
      number = Integer.toString(count);
      verb = "are";
      pluralModifier = "s";
   }

   private void thereIsOneLetter(){
      number = "1";
      verb = "is";
      pluralModifier = "";
   }

   private void thereAreNoLetters(){
      number = "no";
      verb = "are";
      pluralModifier = "s";
   }
}
