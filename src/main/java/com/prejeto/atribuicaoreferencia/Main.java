package com.prejeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1; //PRIMITIVO
        int intB = intA; //atribuí val intA ao intB

        System.out.println("intA=" + intA + " intB=" + intB);
        intA = 2; //modificação intA para val 2, o intA fica 2 mas intB n modifica
        System.out.println("intA=" + intA + " intB=" + intB);
//n copiou a referência e sim o valor em memória #PRIMITIVO
        MeuObj objA = new MeuObj(1); //
        MeuObj objB = objA; //N está copiando o próprio objA e colocando no objB... está copiando a referência de memória do objA e atribuindo ao objB

        System.out.println("objA=" + objA + " objB=" + objB);
        objA.setNum(2); //qdo igual a 2 ele vai no endereço de memória e setando igual a 2
        System.out.println("objA=" + objA + " objB=" + objB);



    }
}

