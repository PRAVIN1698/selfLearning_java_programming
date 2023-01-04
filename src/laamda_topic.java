import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class laamda_topic {

    int a=5;
void sdg() {
    Square s1;
    s1 = (int y) -> y * y;

    hello h;
    h=()->3.14;
    System.out.println(h.pi());
    int ans=s1.calculate(a);
    System.out.println(ans);





    }








}










interface hello{
    Double pi();
}


@FunctionalInterface
interface Square{

    int calculate(int y);
}
