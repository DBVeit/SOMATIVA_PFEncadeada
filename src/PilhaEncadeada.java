public class PilhaEncadeada {

    public ListaEncadeada listaPilha;

    public PilhaEncadeada(){
        listaPilha = new ListaEncadeada();
    }

    public void empilha (int dado){
        listaPilha.inserePrimeiro(dado);//Empilha o elemento dado
    }

    public int desempilha(){
        if(!(listaPilha.vazia())){
            int topo = listaPilha.removePrimeiro().info;//Retorna e retira o elemento do topo da lista
            return topo;
        }else {
            System.out.println("Pilha vazia");
            return -1;//retorna um valor inválido caso a pilha esteja vazia
        }
    }

    /*
     * Usa-se a função inserePrimeiro e a função removePrimeiro
     * O conceito de PILHA trata de INSERIR e REMOVER elementos sempre na posição mais superior da pilha (TOPO)
     * O elemento no topo é o ÚLTIMO a entrar e o PRIMEIRO a sair (LIFO)
     * A função inserePrimeiro sempre INSERE NA POSIÇÃO MAIS ALTA (TOPO), empilhando os elementos
     * A função removePrimeiro sempre REMOVE NA POSIÇÃO MAIS ALTA (TOPO)
     *
     */

    public int topo(){
        if (!listaPilha.vazia()){
            return listaPilha.primeiro();//Retorna o elemento do topo da pilha (não modifica a pilha)
        }else {
            System.out.println("Pilha vazia");
            return -1;
        }
    }

    public void mostra_pilha(){
        if(!listaPilha.vazia()){
            listaPilha.imprime();//Mostra todos os elementos armazenados na pilha
        }else {
            System.out.println("Pilha vazia");
            return;
        }
    }


}
