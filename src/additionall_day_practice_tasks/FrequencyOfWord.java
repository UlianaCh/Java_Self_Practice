package additionall_day_practice_tasks;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String word = "java";
        String sentence = "Java Java Java JAVA cat Java cat";
        sentence = sentence.toLowerCase();
        int x = 0;
        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            x++;
        }
        System.out.println(x);
    }
}
