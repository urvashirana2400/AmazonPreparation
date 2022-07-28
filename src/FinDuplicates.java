import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FinDuplicates {
    public static void main(String[] args) {
        List<Integer> ls=Arrays.asList(1,2,4,5,1,6,7,4);
        Set<Integer> unique=new HashSet<>();
        Set<Integer> duplicates=ls.stream().filter(x->!(unique.add(x))).collect(Collectors.toSet());
        System.out.println(unique);
    }
}
