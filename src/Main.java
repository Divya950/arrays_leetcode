public class Main {
    public static void main(String[] args) {
        // Test Two Sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum_Optimized ts = new TwoSum_Optimized();
        int[] res = ts.twoSum(nums, target);
        System.out.println("TwoSum -> " + res[0] + ", " + res[1]); // expect 0, 1

        // Test GetConcatenation
        int[] a = {1, 2, 1};
        GetConcatenation gc = new GetConcatenation();
        int[] ans = gc.getConcatenation(a);
        System.out.print("Concat -> ");
        for (int v : ans) System.out.print(v + " "); // expect 1 2 1 1 2 1
        System.out.println();
    }
}
