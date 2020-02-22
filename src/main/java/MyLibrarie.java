import pl.altkom.utils.HelloUtil;

public class MyLibrarie {

    public static void main(String[] args) {
        System.out.println(myUpperCase("Maciej"));

    }

    public static String myUpperCase(String name){
        return HelloUtil.hello(name).toUpperCase();
    }

}
