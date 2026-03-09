class Solution {
    int memo[21][21];

    bool solve(int i, int j, string& s, string& p) {
        if (j == p.length()) return i == s.length();
        if (memo[i][j] != -1) return memo[i][j];

        bool first_match = (i < s.length() && (p[j] == s[i] || p[j] == '.'));

        bool res;
        if (j + 1 < p.length() && p[j + 1] == '*') {
            res = solve(i, j + 2, s, p) || (first_match && solve(i + 1, j, s, p));
        } else {
            res = first_match && solve(i + 1, j + 1, s, p);
        }

        return memo[i][j] = res;
    }

public:
    bool isMatch(string s, string p) {
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                memo[i][j] = -1;
            }
        }
        return solve(0, 0, s, p);
    }
};


