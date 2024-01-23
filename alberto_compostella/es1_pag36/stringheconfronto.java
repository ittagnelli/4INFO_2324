public class stringheconfronto{
    public static int compare(String s1, String s2){
        int conta = 0;
        int min = 0;
        int Nconsegutive = 0;
                if(s1.equals(s2)==true){
            return s1.compareTo(s2);
        }else{
            if(s1.length()>s2.length()){
            min = s2.length();
            }else{
                min = s1.length();
            }
            for(int i = 0; i< min; i++){
                if(s1.charAt(i)==s2.charAt(i)){
                    conta++;
                    Nconsegutive = conta;
                }else{
                    Nconsegutive = conta;
                    conta = 0;
                    
                }
            }
            return Nconsegutive;
        }

    }
    


}
