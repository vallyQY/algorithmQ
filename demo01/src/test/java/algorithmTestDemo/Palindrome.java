package algorithmTestDemo;

public class Palindrome {
    public boolean isPalindrome0(int num){
        if(num<0||num%10==0&&num!=0) return false;
        int div = 1;
        while(num/div>=10){
            div*=10;
        }
        while(num>0){
            int left = num/div;
            int right = num%10;
            if(left!=right) return false;
            num = num%div/10;
            div/=10;
        }
        return true;
    }

    public boolean isPalindrome1(int num){
        if(num<0||num%10==0&&num!=0) return false;
        int revertNum = 0;
        while(num>revertNum){
            revertNum = num%10 + revertNum*10;
            num/=10;
        }
        return revertNum==num||revertNum/10==num;
    }
}
