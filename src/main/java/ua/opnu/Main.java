package ua.opnu;

/**
 * Main class with logical, boolean, array and string tasks.
 */
public class Main {

    /** Constant for zero. */
    private static final int ZERO = 0;

    /** Constant for hundred. */
    private static final int HUNDRED = 100;

    /** Constant for ten. */
    private static final int TEN = 10;

    /** Constant for twenty. */
    private static final int TWENTY = 20;

    /** Start of teen range. */
    private static final int TEEN_START = 13;

    /** End of teen range. */
    private static final int TEEN_END = 19;

    /** Constant for nine. */
    private static final int NINE = 9;

    /** Constant for four. */
    private static final int FOUR = 4;

    /** Constant for three. */
    private static final int THREE = 3;

    /**
     * Entry point.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello world!");
    }

    // ======== Logical operations ========

    /**
     * Given two temperatures, return true if one is less than 0
     * and the other is greater than 100.
     *
     * @param temp1 first temperature
     * @param temp2 second temperature
     * @return true if one < 0 and the other > 100
     */
    public boolean icyHot(final int temp1, final int temp2) {
        return (temp1 > HUNDRED && temp2 < ZERO)
                || (temp1 < ZERO && temp2 > HUNDRED);
    }

    /**
     * Given 2 int values, return true if either of them
     * is in the range 10..20 inclusive.
     *
     * @param a first value
     * @param b second value
     * @return true if one of them in 10..20
     */
    public boolean in1020(final int a, final int b) {
        return (a >= TEN && a <= TWENTY)
                || (b >= TEN && b <= TWENTY);
    }

    /**
     * We'll say that a number is "teen" if it is in
     * the range 13..19 inclusive.
     * Return true if 1 or more numbers are teen.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return true if any is teen
     */
    public boolean hasTeen(final int a, final int b, final int c) {
        return (a >= TEEN_START && a <= TEEN_END)
                || (b >= TEEN_START && b <= TEEN_END)
                || (c >= TEEN_START && c <= TEEN_END);
    }

    // ======== Boolean expressions ========

    /**
     * We sleep in if it is not a weekday or we're on vacation.
     *
     * @param weekday true if it is weekday
     * @param vacation true if on vacation
     * @return true if we sleep in
     */
    public boolean sleepIn(final boolean weekday, final boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We are in trouble if both monkeys smile or
     * if neither smiles.
     *
     * @param aSmile first monkey smiles
     * @param bSmile second monkey smiles
     * @return true if we are in trouble
     */
    public boolean monkeyTrouble(final boolean aSmile, final boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    /**
     * Return true if one number is negative and the other positive.
     * If negative flag is true, return true only if both are negative.
     *
     * @param a first number
     * @param b second number
     * @param negative mode flag
     * @return true if condition holds
     */
    public boolean posNeg(final int a, final int b, final boolean negative) {
        if (negative) {
            return a < ZERO && b < ZERO;
        }
        return (a < ZERO && b > ZERO) || (a > ZERO && b < ZERO);
    }

    // ======== Loops and Arrays ========

    /**
     * Count number of 9's in the array.
     *
     * @param nums array of integers
     * @return count of 9
     */
    public int arrayCount9(final int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == NINE) {
                count++;
            }
        }
        return count;
    }

    /**
     * Return true if one of first 4 elements in array is 9.
     *
     * @param nums array of integers
     * @return true if 9 is in first 4
     */
    public boolean arrayFront9(final int[] nums) {
        int end = Math.min(nums.length, FOUR);
        for (int i = 0; i < end; i++) {
            if (nums[i] == NINE) {
                return true;
            }
        }
        return false;
    }

    /**
     * Return true if sequence 1,2,3 appears in array.
     *
     * @param nums array of integers
     * @return true if contains 1,2,3
     */
    public boolean array123(final int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == THREE) {
                return true;
            }
        }
        return false;
    }

    // ======== Strings ========

    /**
     * Given a string name, return a greeting "Hello name!".
     *
     * @param name input string
     * @return greeting
     */
    public String helloName(final String name) {
        return "Hello " + name + "!";
    }

    /**
     * Return new string where last 2 chars are swapped.
     *
     * @param str input string
     * @return string with swapped last 2 chars
     */
    public String lastTwo(final String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        char secondLast = str.charAt(str.length() - 2);
        char last = str.charAt(str.length() - 1);
        return start + last + secondLast;
    }

    /**
     * Return string made of middle two chars.
     * String length is even and >= 2.
     *
     * @param str input string
     * @return middle two characters
     */
    public String middleTwo(final String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }
}
