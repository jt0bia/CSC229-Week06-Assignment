public class Question1 {
    public static void function(int n) {
        int i, k, j;

        i = n;
        while (i > 1) {
            j = i;
            while (j < n) {
                k = 0;
                while (k < n) {
                    k = k + 2;      // n
                }
                j = j * 2;          // log(n)
            }
            i = i / 2;              // log(n)
        }
    }
}

    // What is the complexity of the following
    // set loops, where n is given as input:

    // For the while loop that iterates k, the complexity is O(n)
    // because the k linearly iterates as 2 is added to k until it
    // reaches n.

    // For the while loop that iterates j, the complexity is O(log(n))
    // because is exponentially iterating by j doubling until
    // it reaches n, making the time complexity logarithmic.

    // The same can be said for the while loop that iterates i, it also
    // has a complexity of O(log(n)) because i exponentially iterates
    // by being divided by 2 until it reaches n, making the time complexity
    // logarithmic as well.

    // The entire function will therefore have a complexity of O(n*log^2(n)) as
    // O(n), log(n) and log(n) are multiplied together since each loop is nested
    // with each other.