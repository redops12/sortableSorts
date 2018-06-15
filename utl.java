import java.util.Scanner;
public class utl{
    public static void printArr(int[] a){
        System.out.print("{");
        for (int i = 0; i < a.length - 1; i++)
            System.out.print(a[i] + ",");
        System.out.println(a[a.length - 1] + "}");
    }
    
    public static int[] cpy(int[] a){
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];
        }
        return b;
    }
    
    public static void random(int[] a, int min, int max){
        for(int i = 0; i < a.length; i++){
            a[i] = min+ (int) (Math.random()*(max-min));
        }
    }
    
    public static int askInt(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        int x = scn.nextInt();
        scn.nextLine();
        return x;
    }
    
    public static char askChar(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        String x = scn.nextLine();
        char y = x.toLowerCase().charAt(0);
        return y;
    }
    
    public static String ask(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        String x = scn.nextLine();
        return x;
    }
    
    public static double askDouble(String question) {
        Scanner scn = new Scanner(System.in);
        System.out.print(question + "\t");
        float x = scn.nextFloat();
        scn.nextLine();
        return x;
    }
    
    public static void say(String statement){
        System.out.println(statement);
    }
}