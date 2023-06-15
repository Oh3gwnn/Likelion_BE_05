package javaproject2.programmers;

public class ConnectedNumber_181928 {
    public int solution(int[] num_list) {
        int odd = 0, even = 0;

        for (int i : num_list) {
            if (i % 2 == 1) odd = odd*10 + i;
            else even = even*10 + i;
        }
        return odd+even;
    }
}

//    def solution(num_list):
//        # 다 풀고 깨달았는데 이거 string으로 안해도 될 듯?
//        odd, even = [], []
//        for i in num_list:
//        if i%2==1: odd += str(i)
//        else: even += str(i)
//        return int("".join(odd))+int("".join(even))
