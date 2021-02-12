import java.util.ArrayList;
import java.util.List;

public class ContainsTest {
    public static void main(String[] args) {
        List<String> expected = new ArrayList<>();
        expected.add("amegy vault services");
        expected.add("personal online banking");
        expected.add("remote deposit capture");
        expected.add("treasury internet banking");

        List<String> actual = new ArrayList<>();
        actual.add("amegy vault services");
        actual.add("personal online banking");
        actual.add("fred banking");
        actual.add("remote deposit capture");
        actual.add("treasury internet banking (Nickname Joe)");

        System.out.println("actual and expected are similar..." +
                aMatchIsFound(actual,expected));
    }

    public static boolean aMatchIsFound (List<String> actual, List<String> expected) {
        boolean allMatch = true;
        for(String s1 : actual) {
            boolean anyMatch = false;
            for(String s2 : expected) {
                anyMatch = s1.contains(s2);
                if(anyMatch)
                    break;
            }
            allMatch = anyMatch;
            if(!allMatch)
                break;
        }
        return allMatch;
    }
}
