public class Main {
    public static void main(String[] args) {

        System.out.println("-->INICIANDO PILHA<--");

        PilhaEncadeada pilhaEncadeada = new PilhaEncadeada();
        //Cria uma pilha encadeada

        pilhaEncadeada.empilha(18);
        pilhaEncadeada.empilha(03);
        pilhaEncadeada.empilha(20);
        pilhaEncadeada.mostra_pilha();
        //Empilha elementos e exibe o empilhamento atual

        int topo1 = pilhaEncadeada.topo();
        System.out.println("Topo atual = " + topo1);
        //Busca o elemento atualmente no topo e o exibe

        int desempilha = pilhaEncadeada.desempilha();
        System.out.println("Desempilhando... = " + desempilha);
        //Desempilha o elemento no topo conforme a regra

        int topo2 = pilhaEncadeada.topo();
        System.out.println("Topo atual = " + topo2);
        pilhaEncadeada.mostra_pilha();
        //Busca o elemento atualmente no topo e o exibe, e exibe o empilhamento atual

        pilhaEncadeada.empilha(17);
        pilhaEncadeada.mostra_pilha();
        //Empilha um novo elemento e exibe o empilhamento atual

        int topo3 = pilhaEncadeada.topo();
        System.out.println("Topo atual = " + topo3);
        //Busca o elemento atualmente no topo e o exibe

        System.out.println("-->FINALIZANDO PILHA<--\n");

        /*
        *
        * */

        System.out.println("-->INICIANDO FILA<--");

        FilaEncadeada filaEncadeada = new FilaEncadeada();
        //Cria uma fila encadeada

        filaEncadeada.insere(18);
        filaEncadeada.insere(03);
        filaEncadeada.insere(20);
        filaEncadeada.mostra_fila();
        //Insere elementos na fila e exibe a fila atual

        int removido = filaEncadeada.remove();
        System.out.println("Removendo elemento... = " + removido);
        filaEncadeada.mostra_fila();
        //Remove o primeiro elemento da fila conforme a regra e exibe a fila atual

        filaEncadeada.insere(17);
        //Insere novo elemento ao final da fila conforme regra

        filaEncadeada.mostra_fila();
        //Exibe a fila atual

        System.out.println("-->FINALIZANDO FILA<--");

    }
}