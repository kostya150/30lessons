package lesson16;

public class DlyaSebya {
    public static void main(String[] args) {
        //String str = "t  ttt";
        // String tmp = "abc abcde abcdef a a a a a a  words abc a abc g";
        // Sys.out.println(mostCountedWord(tmp));
        String address = "https://www.google.com";
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
        if(address.isEmpty()){
            return false;
        }
        String begin1 = "http://";
        String begin2 = "https://";
        String domain1 = "com";
        String domain2 = "org";
        String domain3 =  "net";
        String name1 = address.substring(0, 7);//http://
        String name2 = address.substring(0, 8);//https://
        String name3 = address.substring(address.length()-4);//com org net
        String name4 = address.substring(4, address.length()-4);

        String[] words = address.split(" ");
        //TODO другие точки или спецсимволы не должны быть в адресе
        for(String i : words){
            if(name1.equals("http://") || name2.equals("https://") && (name3.equals(".com") || name3.equals(".org") || name3.equals(".net")))
                return true;
        }
        return false;
    }
}
