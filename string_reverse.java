import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args){
        System.out.println("Please type what you want for reversing");
        Scanner input = new Scanner(System.in);
        String emptyWord = "";
        String inputWord = input.nextLine();
        for (int x = 0; x < inputWord.length(); x++){
            emptyWord = inputWord.charAt(x) + emptyWord;
        }
        System.out.println(emptyWord);
    }
}
