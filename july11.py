#User function Template for python3

class Solution:
    def findK(self, a, n, m, k):
        lmin, rmin = 0, 0
        lmax, rmax = n - 1, m - 1
        while lmin <= lmax and rmin <= rmax:
            for i in range(rmin, rmax):
                k -= 1
                if k == 0:
                    return a[lmin][i]
            for i in range(lmin, lmax):
                k -= 1
                if k == 0:
                    return a[i][rmax]
            for i in range(rmax, rmin, -1):
                k -= 1
                if k == 0:
                    return a[lmax][i]
            for i in range(lmax, lmin, -1):
                k -= 1
                if k == 0:
                    return a[i][rmin]
            if rmin == rmax and lmin == lmax:
                k -= 1
                if k == 0:
                    return a[lmin][rmin]
            rmin += 1
            rmax -= 1
            lmin += 1
            lmax -= 1
