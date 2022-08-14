
//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
// which causes all the following ones to be bad.
//
//You are given an API bool isBadVersion(version) which returns whether version is bad.
// Implement a function to find the first bad version.
// You should minimize the number of calls to the API.

//Time Complexity :- O(log n)
//Space Complexity :- O(1)

public class BadVersion {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isBadVersion(int mid) {
        return true;
    }
}
