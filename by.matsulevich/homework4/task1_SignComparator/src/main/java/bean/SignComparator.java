package bean;

public class SignComparator {
    String  compare;
    public String compare(int number){
     if(number>0) compare = "Number is positive";
     else if(number<0) compare = "Number is negative";
     else compare = "Number is equal to zero";
     return compare;

    }
}
