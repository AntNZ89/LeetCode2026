package january.medium;

public class BestClosingTime {
    public int bestClosingTime(String customers) {

        int n = customers.length();
        int[] ans = new int[n+1];

        for (char ch : customers.toCharArray()){
            if (ch == 'Y'){
                ans[0]++;
            }
        }

        int index = 0;
        int sum = ans[0];

        for (int i = 1 ; i <= n ; i++){
            if (customers.charAt(i-1) == 'Y'){
                ans[i] = ans[i-1] - 1;
            }
            else if (customers.charAt(i-1) == 'N'){
                ans[i] = ans[i-1] + 1;
            }

            if (ans[i] < sum){
                sum = ans[i];
                index = i;
            }
        }

        return index;

    }
}
