import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexquestion2{
    public static void main(String[] args) {
        Pattern p2 = Pattern.compile("[n|N][a-z A-Z]*[j|J]");
        Matcher m2 = p2.matcher("Nikhil");
        int c=0;
        while (m2.find()){
            System.out.println(m2.start()+"---"+m2.end()+"---"+m2.group());
            c++;
        }
    }
}
// Name Ending with j|J

class RegexQ3{
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("[a-z A-Z]*[j|J]");
        Matcher m1 = p1.matcher("Anuj");
        int c=0;
        while (m1.find()){
            System.out.println(m1.start()+"---"+m1.end()+"---"+m1.group());
            c++;
        }
    }
}
