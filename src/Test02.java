import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test02 {

    public static void main(String[] args) {
        String[] str = {"招呼语","hahha","nihao","shabi","招呼语"};
        List<String> list = Arrays.asList(str);
       /* for(String s : list){
            System.out.println(s);
        }
        list.forEach((s) -> System.out.println(s));
        System.out.println("----------------");
        list.forEach(System.out::println);
        System.out.println("------------------");*/
//        list.stream().distinct().collect(Collectors.toList());
        Set<String> set=new HashSet<>(list);
        set.forEach(System.out::println);

    }
}
