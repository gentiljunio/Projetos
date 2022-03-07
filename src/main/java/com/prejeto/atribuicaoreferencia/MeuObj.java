package com.prejeto.atribuicaoreferencia;

public class MeuObj {

    Integer num;

    public MeuObj(int num) {
        this.num = Integer.valueOf(num);
    }

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
