package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliary = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliary);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPopped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPopped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){

 //       if(refNoEntrantPilha == null){
 //           return true;
 //       }
 //       return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "-------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
