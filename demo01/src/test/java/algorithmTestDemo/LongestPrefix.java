package algorithmTestDemo;

public class LongestPrefix {
    public String findLongestPrefix0(String[] strs){
        if(strs.length==0)  return "";
        for(int i=1;i<strs.length;i++){
            char temp = strs[0].charAt(0);
            for(int j = 0;j<strs[i].length();j++){
                if(i==strs[j].length()||temp!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    /*public String findLongestPrefix1(String[] strs){

    }*/
}
