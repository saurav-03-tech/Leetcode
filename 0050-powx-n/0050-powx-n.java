class Solution {
    public double myPow(double x, int n) {
        long power = n;
        double res = 1;
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        while (power > 0) {
            if (power % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            power = power / 2;
        }

        return res;
    }
}