/**
 * @author sauceWu .
 * @since 2018/1/30 16:46
 */

//i    bin       '1'    i&(i-1)
//        0000    0
//        -----------------------
//        0001    1    0000
//        -----------------------
//        0010    1    0000
//        0011    2    0010
//        -----------------------
//        0100    1    0000
//        0101    2    0100
//        0110    2    0100
//        0111    3    0110
//        -----------------------
//        1000    1    0000
//        1001    2    1000
//        1010    2    1000
//        1011    3    1010
//        1100    2    1000
//        1101    3    1100
//        1110    3    1100
//        1111    4    1110
//
//    其实原生有实现。
////Integer.bitCount(i);
class CountingBits {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        res[0]=0;
        for (int i = 1; i <=num; i++) {
            res[i] = res[i & (i - 1)] + 1;
        }

        return res;
    }
}
