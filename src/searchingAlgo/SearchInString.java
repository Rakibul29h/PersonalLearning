package searchingAlgo;

public class SearchInString {
    static void main(String[] args) {
        String name = "Rakibul Islam";
        char target='h';
        System.out.println(search(name,target));
    }
    static boolean search(String str,char ch){
    if(str.length()==0) {
        return false;
    }

        for (int i = 0; i < str.length(); i++) {
            if(ch== str.charAt(i))
                return true ;
        }


        /*


        for(char c : str.toCharArray()){
          if(ch==c)
          return true;
        }

         */

    return false ;
    }
}
