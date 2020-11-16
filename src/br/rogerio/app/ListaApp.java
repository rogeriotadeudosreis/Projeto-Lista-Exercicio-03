/*
Exercícios de Fixação – Lista
3. Considere que uma lista linear L1 foi implementada através de vetores
representando uma sequência de caracteres. Construa uma função para
imprimir a sequência de caracteres da lista L1 na ordem inversa (não é
permitido o uso de listas auxiliares). Ex: Para a lista L1={A,E,I,O,U}, a função
deve imprimir “UOIEA”.
 */
package br.rogerio.app;

import br.rogerio.model.Lista;

/**
 *
 * @author roger
 */
public class ListaApp {

    public static void main(String[] args) {

        String[] vetor = {"e", "s", "f", "c", "a"};
        String[] vetor1 = new String[5];
        Lista lista = new Lista(vetor1.length);
        
        System.out.printf("Vetor informado de: %d%s\n", vetor.length, " posições");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + ", ");
        }
        System.out.println("");

        lista.receberVetor(vetor);
        lista.mostrarLista();
        
        lista.imprimirListaInversa();
        
        lista.ordenarLista();
        
    }

}
