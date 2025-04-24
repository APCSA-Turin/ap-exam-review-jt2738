public class frq1{
    public static String letterAndPattern (String letter, String pattern){
        if(pattern.contains(letter)){
            return letter;
        }else{
            String newStr= "";
    for(int i= pattern.length()-1; i>=0; i--){
        if(i==pattern.length()-1){
            newStr+= pattern.substring(i);
        }else{
            newStr+= pattern.substring(i, i+1);
        }
                 }
                 return newStr;
        }
        
    }
    public static void main(String[] args){
        System.out.println(letterAndPattern("Z", "QUICK"));
    }
    
}
