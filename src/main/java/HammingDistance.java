/**
 * @author sauceWu .
 * @since 2018/1/26 11:39
 */

class HammingDistance {


    public  int hammingDistance(int x, int y) {
        int result = 0;
        for (int i = 0; i < 32; ++i) {
            if ((x & (1 << i)) != (y & (1 << i))) {
                ++result;
            }
        }
        return result;
    }
}
