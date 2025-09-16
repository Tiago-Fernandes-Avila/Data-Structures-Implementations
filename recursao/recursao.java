public class recursao {
    public static void main(String[]ars){
        System.out.println(fat(10));
    }
    public static int fat(int i){
        if (i == 1){
            return 1;
        }
        else {                       //  3 *     2    =      2     *    1
            return i * fat( i-1);  // x = 3 * fat(x - 1){ x = 2  fat(2 - 1) {1 == 1  return} }
        }
    }
}
