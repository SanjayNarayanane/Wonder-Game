import java.util.*; 
class uniquedigitcount { 
    public static void
    countUniqueDigits(int N) 
    { 
        int res = 0; 
        int cnt[] = { 0, 0, 0, 0, 0, 
                      0, 0, 0, 0, 0 }; 
        while (N > 0) 
		{ 
            int rem = N % 10; 
            cnt[rem]++; 
			N = N / 10; 
        } 
        for (int i = 0; 
             i < cnt.length; i++) 
		{ 
            if (cnt[i] == 1) 
			{ 
                res++; 
            } 
        } 
        System.out.println(res); 
    } 
    public static void main(String[] args) 
    { 
        int N = 1111234511; 
        countUniqueDigits(N); 
    } 
}	