public class Triangle {
    public static int triangle(int n) {
        int num = 0;
        for (int i = 0; i<= n; i++){
            num += i;
        }
        return num; 
    }
    public static void main(String args[]) {
        System.out.println(triangle(6));
    }
}