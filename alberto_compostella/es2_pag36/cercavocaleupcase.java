package es2pag36;

public class cercavocaleupcase {
    public static boolean cerca(String s1){
        int conta = 0;
        for(int i = 0;i<s1.length();i++){
        if(s1.charAt(i) == 'A' || s1.charAt(i) == 'E' || s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U'){
            conta++;
        }
    }
    if(conta > 0){
        return true;
    }else{
        return false;
    }
}
    
}
