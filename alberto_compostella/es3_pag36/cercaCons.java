package es3_pag36;

public class cercaCons {
    public static boolean cerca(String s1){
        int conta = 0;
           s1.toLowerCase();
            for(int i = 0; i< s1.length(); i++){
                if(s1.charAt(i)!='a' && s1.charAt(i)!='e' && s1.charAt(i)!='i' && s1.charAt(i)!='o' && s1.charAt(i)!='u'){
                    conta++;
                if(conta >= 3){
                    break;
                }
                }else{
                    conta = 0;
                }
            }
            if(conta >= 3){
                return true;
            }else{
                return false;
            }
        }

    }

    

