import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String number1 = br.readLine();
        String number2 = br.readLine();
        long m= Integer.parseInt(number1);
        int n= Integer.parseInt(number2);

        System.out.println(countingNumberOfPathsInMaze(m-1,n-1));
    }

    private static int countingNumberOfPathsInMaze(long m, int n) {
        if(m==0&&n==0)
            return 0;
        if(m==0||n==0)
            return 1;
        return countingNumberOfPathsInMaze(m-1,n)+countingNumberOfPathsInMaze(m,n-1);
    }
}