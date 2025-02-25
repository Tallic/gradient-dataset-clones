package at.jku.isse.clones.r2AA;

/**
 * @author tsukuno
 */
public class Dev6 {
    public static int run(int _n, int _p, int[] _g) {
        int N = _n;
        int P = _p;
        int count[] = new int[P];
        for(int i = 0; i < N; ++i) {
            ++count[ _g[i] % P ];
        }

        // greedy assign;
        int ret = count[0];
        count[0] = 0;

        if( P == 2 ) {
            ret += (count[1] + 1) / 2;
        }
        else if( P == 3 ) {
            int min = Math.min(count[1], count[2]);
            ret += min;
            count[1] -= min;
            count[2] -= min;
            ret += (count[1] + 2) / 3;
            ret += (count[2] + 2) / 3;
        }
        else if( P == 4 ) {
            {
                int two = Math.min(count[1], count[3]);
                ret += two;
                count[1] -= two;
                count[3] -= two;
            }
            {
                int two = count[2] / 2;
                ret += two;
                count[2] -= two * 2;
            }
            {
                int three = Math.min( count[2], Math.max(count[1] / 2, count[3] / 2) );
                // at most 1;
                ret += three;
                count[2] -= three;
                if( count[1] > 0 ) { count[1] -= three * 2; }
                if( count[3] > 0 ) { count[3] -= three * 2; }
            }
            {
                if( count[1] > 0 || count[2] > 0 || count[3] > 0 ) { ++ret; }
            }
        }

//        System.out.println("Case #" + C + ": " + ret);
        return ret;
    }

}
