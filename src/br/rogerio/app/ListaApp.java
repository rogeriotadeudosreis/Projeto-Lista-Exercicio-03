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

        char[] vetor = {'a', 'e', 'i', 'o', 'u'};
        Lista lista = new Lista(vetor.length);

        try {
            System.out.printf("Vetor de char informado de: %d%s\n", vetor.length, " posições");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + ", ");
                lista.inserirNaPosicaoInformada(i, vetor[i]);
            }
            System.out.println("");
            
            imprimirDeFormaInversa(lista);
            
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

    private static void imprimirDeFormaInversa(Lista lista) {

        System.out.printf("%s\n", "Impresso de forma inversa");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.getElementoNaPosicaoInformata(i) + ", ");
        }
        System.out.println("");
    }
}
