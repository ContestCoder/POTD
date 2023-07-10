class Solution {
    public int findK(int[][] a, int n, int m, int k) {
        int lmin = 0, rmin = 0;
        int lmax = n - 1;
        int rmax = m - 1;
        while (lmin <= lmax && rmin <= rmax) {
            for (int i = rmin; i < rmax; i++) {
                k--;
                if (k == 0) return a[lmin][i];
            }
            for (int i = lmin; i < lmax; i++) {
                k--;
                if (k == 0) return a[i][rmax];
            }
            for (int i = rmax; i > rmin; i--) {
                k--;
                if (k == 0) return a[lmax][i];
            }
            for (int i = lmax; i > lmin; i--) {
                k--;
                if (k == 0) return a[i][rmin];
            }
            if (rmin == rmax && lmin == lmax) {
                k--;
                if (k == 0) return a[lmin][rmin];
            }
            rmin += 1;
            rmax -= 1;
            lmin += 1;
            lmax -= 1;
        }
        return -1; // Or handle the case when k is out of bounds
    }
}
