package algorithmTestDemo;

import java.util.HashMap;
import java.util.Map;

class RomanToInt {
    private Map<String,Integer> map = new HashMap<>();
    public int convertRomen0(String str){
        initMap(map);
        String[] splitsArr = str.split("");
        int sum = 0;
        int len = splitsArr.length;
        for(int i=0;i<splitsArr.length;i++){
            switch (splitsArr[i]){
                case "I":
                    if(i!=len-1&&splitsArr[i+1].equals("V")){sum+=4;break;}
                    else if(i!=len-1&&splitsArr[i+1].equals("X")){sum+=9;break;}
                    else{sum+=1;break;}
                case "V":
                    if(i!=0&&splitsArr[i-1].equals("I")){break;}
                    else{sum+=5;break;}
                case "X":
                    if(i!=0&&splitsArr[i-1].equals("I")){break;}
                    else if(i!=len-1&&splitsArr[i+1].equals("L")){sum+=40;break;}
                    else if(i!=len-1&&splitsArr[i+1].equals("C")){sum+=90;break;}
                    else{sum+=10;break;}
                case "L":
                    if(i!=0&&splitsArr[i-1].equals("X")){break;}
                    else{sum+=50;break;}
                case "C":
                    if(i!=0&&splitsArr[i-1].equals("X")){break;}
                    else if(i!=len-1&&splitsArr[i+1].equals("D")){sum+=400;break;}
                    else if(i!=len-1&&splitsArr[i+1].equals("M")){sum+=900;break;}
                    else{sum+=100;break;}
                case "D":
                    if(i!=0&&splitsArr[i-1].equals("C")){break;}
                    else{sum+=500;break;}
                case "M":
                    if(i!=0&&splitsArr[i-1].equals("C")){break;}
                    else{sum+=1000;break;}
            }
        }
        return sum;
    }
    private void initMap(Map<String,Integer> map){
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
    }
}