package lesson16;
public class Solution {
    public static void main(String[] args) {
        //String str = "t  ttt";
       // String tmp = "abc abcde abcdef a a a a a a  words abc a abc g";
       // Sys.out.println(mostCountedWord(tmp));
        String address = "https://google.com";
        System.out.println(validate(address));

    }


    /*public static int countWords(String input) {
        String[] words = input.split(" ");
        if(words.length == 0)
            return 0;

        int count = 0;
        for(String word: words){
            if(word.length() > 0 && checkLetter(word))
                count++;
        }
        return count;
    }

    private static boolean checkLetterOrNumber(String name) {
        char[] chars = name.toCharArray();
         for(char c : chars){
             if(!Character.isLetter(c)){
                 return false;
             }
         }
        return true;
    }

    public static String minWord(String input) {
        String[] words = input.split(" ");
        if(words.length == 0)
           return null;

        String minWord = null;

        for(String word : words){
            if(word.length() > 0 && checkLetter(word) ){
                minWord = word;
                break;
            }
        }
        if(minWord == null)
            return null;

        for(String word : words){
            if(word.length() < minWord.length() && checkLetter(word) && word.length() > 0){
                minWord = word;
            }
        }
        return minWord;
    }

    public static String maxWord(String input) {
        String[] words = input.split(" ");
        if(words.length == 0)
            return null;

        String maxWord = null;

        for(String word : words){
            if(word.length() > 0 && checkLetter(word)){
                maxWord = word;
                break;
            }
        }
        if(maxWord == null)
            return null;
        for(String word : words){
            if(word.length() > maxWord.length() && checkLetter(word)){
                maxWord = word;
            }
        }
        return maxWord;
    }

   public static String mostCountedWord(String input){
      if(input.isEmpty()){
          return null;
      }

      String[] words = input.split(" ");
      int maxCount = 0;//количество повтор слов
      String mostFrequent = null;// самое повтор слово
       for(String word : words){
           int count = 0;
           for(String item : words){
               if(word.equals(item) && word.length() > 0 && checkLetter(item))
                   count++;
           }

           if(count > maxCount){
               maxCount = count;
               mostFrequent = word;
           }
       }
       return mostFrequent;
   }*/
    private static boolean checkLetterOrNumber(String name) {
        char[] chars = name.toCharArray();
        for(char c : chars){
            if(!Character.isLetter(c) && !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

   public static boolean validate(String address){
       if(!address.startsWith("http://") && !address.startsWith("https://"))
           return false;

       address = address.replace("http://", "");
       address = address.replace("https://", "");
       address = address.replace("www.", "");

       if(!address.endsWith(".net") && !address.endsWith(".com") && !address.endsWith(".org"))
           return false;

       address = address.replace(".net", "");
       address = address.replace(".com", "");
       address = address.replace(".org", "");

       return checkLetterOrNumber(address);

   }
}


























