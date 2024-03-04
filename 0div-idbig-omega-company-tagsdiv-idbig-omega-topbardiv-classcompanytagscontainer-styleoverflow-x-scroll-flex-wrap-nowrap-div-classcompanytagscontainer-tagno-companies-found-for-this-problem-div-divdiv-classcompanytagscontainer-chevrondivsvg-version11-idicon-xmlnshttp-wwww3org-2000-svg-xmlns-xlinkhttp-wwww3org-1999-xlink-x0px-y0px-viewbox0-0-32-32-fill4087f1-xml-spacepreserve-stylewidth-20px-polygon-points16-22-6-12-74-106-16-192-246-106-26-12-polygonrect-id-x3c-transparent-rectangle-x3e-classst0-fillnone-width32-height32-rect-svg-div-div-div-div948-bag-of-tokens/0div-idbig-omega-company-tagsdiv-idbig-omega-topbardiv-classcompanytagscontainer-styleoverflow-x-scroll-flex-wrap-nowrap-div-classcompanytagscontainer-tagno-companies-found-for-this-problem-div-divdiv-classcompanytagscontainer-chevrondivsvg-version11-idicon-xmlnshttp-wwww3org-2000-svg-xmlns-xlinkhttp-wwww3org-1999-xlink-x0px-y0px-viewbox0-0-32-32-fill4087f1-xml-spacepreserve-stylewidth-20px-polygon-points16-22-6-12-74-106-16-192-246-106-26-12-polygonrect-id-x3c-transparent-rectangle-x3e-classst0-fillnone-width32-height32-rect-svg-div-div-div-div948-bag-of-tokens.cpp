class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());

        int i = 0, j = tokens.size() - 1, ans = 0, score = 0;

        while (i <= j) {
            if (tokens[i] <= power) {
                power = power - tokens[i];
                score++;
                ans = max(ans, score);
                i++;
            } else if (score >= 1) {
                power = power + tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }
        return ans;
    }
};