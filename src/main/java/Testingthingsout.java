import java.util.Scanner;

public class Testingthingsout {

    public static void main(String[] args) {
        System.out.println("Enter the text that contains the word that you want to count");
        Scanner scanner=new Scanner(System.in);
        String targetString=scanner.nextLine();
        System.out.println("Please enter the word that you want to count exactly as it appears");
        String word= scanner.nextLine();

        String[] temp = targetString.split(" ");
        int count =0;
        for (int i=0; i< temp.length; i++) {
            if (word.equalsIgnoreCase(temp[i])) {
                count++;
            }
        }

        System.out.println("The word "+word+" occurs "+count+" times in the string");
//        public void stringKeeper(;) {
//            System.out.println("Enter the text that contains the word that you want to count");
//            String targetString=scanner.nextLine();
//        }

    }
}
