
import java.io.*;
        import java.util.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.toList;

class Result {

    public static long aVeryBigSum(List<Long> ar) {
        // Calculate the sum of all elements in the list
        long sum = 0;
        for (Long num : ar) {
            sum += num;
        }
        return sum;
    }

}

public class AVeryBigSum_24_08 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long result = Result.aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}