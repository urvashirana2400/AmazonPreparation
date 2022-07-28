import java.util.Arrays;
import java.util.List;

public class ReverseVovels {

    public void reverseVowels(String s) {
        char a[]=s.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
            boolean leftIsVowel=isVowel(a[left]);
            boolean rightIsVowel=isVowel(a[right]);
            if(leftIsVowel && rightIsVowel){
                swap(a,left,right);
                ++left;
                --right;
            }
            if(!leftIsVowel){
                ++left;
            }
            if(!rightIsVowel)
            {
                --right;
            }
        }

        System.out.println(new String(a));
    }
    public void swap(char a[],int i,int j){
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public boolean isVowel(char letter){
        char c=Character.toLowerCase(letter);
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
class Main{
    public static void main(String[] args) {
        String s="applepie";
        ReverseVovels r=new ReverseVovels();
        r.reverseVowels(s);

    }
}
