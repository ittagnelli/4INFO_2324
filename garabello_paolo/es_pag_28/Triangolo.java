public class Triangolo {
    private int a, b, c;
    private boolean equilatero = false; 
    private boolean isoscele = false;      
    private boolean scaleno = false;   
    
    public Triangolo(int a, int b, int c){
        SetA(a);
        SetB(b);
        SetC(c);
        Type();
    }

    public void SetA(int var){
        a = var;
    }

    public void SetB(int var){
        b = var;
    }

    public void SetC(int var){
        c = var;
    }

    private void Type(){
        if(a == b && b == c){
            equilatero = true;
        } else {
            if(a == b || a == c || c == b){
                isoscele = true;
            }else{
                scaleno = true;
            }
        }
    }

    public int GetType(){
        if(equilatero)
            return 0;
        else{
            if(isoscele)
                return 1;
        }
        return 2;
    }

    public int Perimetro(){
        return (a + b + c);
    }

    private int FindBase(){
        int base;
        if(a != b){
            if(a != c){
                base = a;
            } else {
                base = b;
            }
        } else {
            base = c;
        }
        return base;
    }

    public int Area(){
        if(equilatero){
            return (a * (int)Math.sqrt(((a*a)-Math.pow((a/2), 2))))/2;
        } else{
            if(isoscele){
                int base = FindBase();
                if(base == a){
                    return (base * (int)Math.sqrt(((b*b)-Math.pow((base/2), 2))))/2;
                } else {
                    return (base * (int)Math.sqrt(((a*a)-Math.pow((base/2), 2))))/2;
                }
            }
        }
        int P = Perimetro()/2; 
        return (int)Math.sqrt((P-a)*(P-b)*(P-c));
    }

    public String toString(){
        int IntType = GetType();
        String StrType = IntType == 0 ? "equilatero" : IntType == 1 ? "isoscele" : "scaleno";
        return "Il triangolo è: " + StrType + "\nIl perimetro vale: " + Perimetro() + "\nL'area vale: " + Area();
    }
}
