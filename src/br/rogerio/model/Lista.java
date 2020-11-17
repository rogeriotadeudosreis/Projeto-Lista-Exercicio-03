/*
 Exercícios de Fixação – Lista
3. Considere que uma lista linear L1 foi implementada através de vetores
representando uma sequência de caracteres. Construa uma função para
imprimir a sequência de caracteres da lista L1 na ordem inversa (não é
permitido o uso de listas auxiliares). Ex: Para a lista L1={A,E,I,O,U}, a função
deve imprimir “UOIEA”.
 */
package br.rogerio.model;

/**
 *
 * @author roger
 */
public class Lista {

    private final int MAXTAM;
    private char[] array;
    private int ultimo;

    public Lista(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho deve ser maior de zero!\n");
        }
        MAXTAM = tamanho;
        array = new char[MAXTAM];
        ultimo = -1;
    }

    public boolean isEmpty() {
        return ultimo == -1;
    }

    public boolean isFull() {
        return ultimo + 1 == MAXTAM;
    }

    public int size() {
        return ultimo + 1;
    }

    public void inserirNoInicio(char elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        for (int i = ultimo; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = elemento;
    }

    public void ordenarLista() {
        char atual;
        int i;
        int j;
        for (i = 1; i < ultimo + 1; i++) {
            atual = array[i];
            j = i - 1;
            while (j >= 0 && (array[j]) >= 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = atual;
        }
        mostrarLista();
    }

    public void inserirDeFormaOrdenada(char elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        int i = ultimo;
        while ((i > 0) && ((array[i - 1]) >= 0)) {
            array[i] = array[i - 1];
            i--;
        }
        array[i] = elemento;
    }

    public void mostrarLista() {
        if (isEmpty()) {
            System.out.println("A lista está vazia!\n");
        } else {
            System.out.println("*****  Elementos da lista  *****");
            for (int i = 0; i <= ultimo; i++) {
                System.out.printf("%s, ", array[i]);
            }
            System.out.println("");
        }
    }

    public void inserirNoFim(char elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        ultimo++;
        array[ultimo] = elemento;
    }

    public void inserirNaPosicaoInformada(int posicao, char elemento) {
        if (isFull()) {
            throw new RuntimeException("A lista está cheia!\n");
        }
        if (posicao > ultimo + 1 || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
        ultimo++;
        for (int i = ultimo; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
    }

    public void removerNoInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        for (int i = 0; i < MAXTAM; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public void removerNoFim() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        ultimo--;
    }

    public void removerElementoNaPosicaoInformada(int posicao) {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        if (posicao < 0 || posicao > ultimo) {
            throw new RuntimeException("Posição inválida!\n");
        }
        for (int i = posicao; i < ultimo; i++) {
            array[i] = array[i + 1];
        }
        ultimo--;
    }

    public int buscarPosicaoDoElemento(char elemento) {
        for (int i = 0; i <= ultimo; i++) {
            if (array[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public boolean removerElemento(char elemento) {
        int pos = buscarPosicaoDoElemento(elemento);
        if (pos == -1) {
            return false;
        }
        removerElementoNaPosicaoInformada(pos);
        return true;
    }

    public char getElementoNoInicio() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[0];
    }

    public char getElementoNoFim() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        return array[ultimo];
    }

    public char getElementoNaPosicaoInformata(int posicao) {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia!\n");
        }
        if (posicao > ultimo || posicao < 0) {
            throw new RuntimeException("Posição inválida!\n");
        }
        return array[posicao];
    }

    public void destroy() {
        ultimo = -1;
    }

    public boolean alterarElemento(char elemento, char novoElemento) {

        for (int i = 0; i < size(); i++) {
            if (elemento == array[i]) {
                array[i] = novoElemento;
                return true;
            }
        }
        return false;
    }

}
