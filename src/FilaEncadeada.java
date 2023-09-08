public class FilaEncadeada {

    public ListaEncadeada listaFila;

    public FilaEncadeada(){
        listaFila = new ListaEncadeada();
    }

    public void insere (int dado){
        listaFila.insereUltimo(dado);//Insere o elemento dado na fila
    }

    public int remove(){
        if (!listaFila.vazia()){
            int removido = listaFila.removePrimeiro().info;//Retorna e remove um elemento da fila
            return removido;
        }else {
            System.out.println("Fila vazia");
            return -1;
        }
    }

    /*
     * Usa-se a função insereUltimo e a função removePrimeiro
     * O conceito de FILA trata de INSERIR elementos sempre na ÚLTIMA posição da fila
     * e REMOVER elementos sempre na PRIMEIRA posição da fila
     * O elemento ao entrar na PRIMEIRA posição é o PRIMEIRO a sair (FIFO)
     * Desta forma, o elemento na ÚLTIMA posição será o ÚLTIMO a sair
     * O último elemento, no entanto, torna-se o PRIMEIRO, caso seja inserido outro elemento, e desta forma, transformasse em uma FILA CIRCULAR
     *
     * A função insereUltimo sempre INSERE NA POSIÇÃO MAIS ALTA (SENDO ELA A POSIÇÃO FINAL DA FILA)
     * A função removePrimeiro sempre REMOVE NA POSIÇÃO MAIS ALTA (PRIMEIRA POSIÇÃO)
     *
     */

    public void mostra_fila(){
        if (!listaFila.vazia()){
            listaFila.imprime();//Mostra todos os elementos da fila
        }else {
            System.out.println("Fila vazia");
        }
    }

}
