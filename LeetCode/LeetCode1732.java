package LeetCode;

public class LeetCode1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];

        altitudes[0] = 0;

        int current = 0;
        int max = 0;
        for(int i=1;i<=gain.length;i++)
        {
            altitudes[i] = current + gain[i-1];
            current = altitudes[i];
            if(altitudes[i] > max)
            {
                max = altitudes[i];
            }
        }
        return max;
    }
}
