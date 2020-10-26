import java.util.Scanner;
public class Experiment5{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        if(Binarysearch(word))
        System.out.println("found");
        else
        System.out.println("not found");
    }
    public static boolean Binarysearch(String word){
        String[] dictionary = {"Aegis", //considering a small dictionary
"apple",	
"bat",	
"cat",	
"doll",	
"eagle"	,
"fan",	
"ghost",	
"heat",	
"it",	
"jail",	
"kill",	
"lamp",	
};
        int lb = 0,ub=dictionary.length-1;
        int mid;
        while(lb<=ub){
            mid=(lb+ub)/2;
            if(dictionary[mid].compareTo(word)==0)
                return true;
            else if(dictionary[mid].compareTo(word)>0)
                ub = mid - 1;
            else
                lb = mid + 1;
        }
        return false;
    }
}


