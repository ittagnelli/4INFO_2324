import java.util.LinkedList;

public class Lista {
    private Nodo testa;

    Lista() {
        testa = null;
    }

    public boolean isEmpty() {
        return testa == null;
    }

    public void addTesta(int number) {
        Nodo nuovo = new Nodo(number);
        if(testa == null) testa = nuovo;
        else {
            nuovo.next = testa;
            testa = nuovo;
        }
    }

    public void addCoda(int number) {
        Nodo nuovo = new Nodo(number);
        if(testa == null) testa = nuovo;
        else {
            Nodo tmp = null;
            for(tmp = testa; tmp.next != null; tmp = tmp.next);
            tmp.next = nuovo;
        }
    }

    public Nodo trovaUltimo() {
        Nodo prec = testa;
        Nodo succ = testa;
        while(succ != null) {
            prec = succ;
            succ = succ.next;
        }

        return prec;
    }

    public Nodo trovaNodo(int number) {
        Nodo succ = testa;
        while(succ != null) {
            if(succ.info == number) return succ;
            else succ = succ.next;
        }

        return null;
    }

    public Nodo trovaNodoPrec(int number) {
        Nodo succ = testa;
        Nodo prec = testa;
        while(succ != null) {
            if(succ.info == number) return prec;
            else {
                prec = succ;
                succ = succ.next;
            }
        }

        return null;
    }

    public void sort(int number, int TERMINATORE) {
        Nodo succ = testa;
        int numeroSostituire = TERMINATORE;
        while(succ != null) {
            if(number > succ.info) {
                numeroSostituire = succ.info;
            } else break;

            succ = succ.next;
        }

        if(numeroSostituire == TERMINATORE) addTesta(number);
        else addDopo(numeroSostituire, number);

    }

    public void addDopo(int number_1, int number_2) {
        Nodo prec = trovaNodo(number_1);
        Nodo nuovo = new Nodo(number_2);
        if(prec != null) {
            nuovo.next = prec.next;
            prec.next = nuovo;
        } else addCoda(number_2);
    }

    public void togliTesta() {
        if(testa != null) testa = testa.next;
    }

    public void togliCoda() {
        if(testa != null) {
            Nodo succ = testa;
            Nodo prec = testa;

            while (succ.next != null) {
                prec = succ;
                succ = succ.next;
            }

            prec.next = null;
        }
    }

    public void togliMezzo(int voluto) {
        if(testa != null) {
            Nodo prec = testa;
            Nodo succ = testa.next;

            if(testa.info == voluto) togliTesta();
            else {
                while ((succ != null) && (succ.info != voluto)) {
                    prec = succ;
                    succ = succ.next;
                }

                if(succ != null) prec.next = succ.next;
            }
        }
    }


    public LinkedList<Integer> removeMultpliNumero(int numero) {
        if(testa != null) {
            Nodo prec = testa;
            Nodo succ = testa.next;
            LinkedList<Integer> ls = new LinkedList<Integer>();

            if((testa.info % numero) == 0) togliTesta();

            while ((succ != null)) {
                if((succ.info % numero) == 0) {
                    prec.next = succ.next;
                    ls.add(succ.info);
                }
                prec = succ;
                succ = succ.next;
            }

            return ls;
            
        } return null;
    }


    @Override
    public String toString() {
        if(testa == null) return "[] -> NULL";
        else return "[] -> " + testa + "";
    }
}