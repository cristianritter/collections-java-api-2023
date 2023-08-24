package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //metodos
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List <Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        System.out.println("O número total de tarefas é " + listatarefa.obterNumeroTotalTarefas());
        listatarefa.adicionarTarefa("Tarefa One");
        listatarefa.adicionarTarefa("Tarefa One");
        listatarefa.adicionarTarefa("Tarefa Two");
        System.out.println("O número total de tarefas é " + listatarefa.obterNumeroTotalTarefas());
        listatarefa.removerTarefa("Tarefa One");
        System.out.println("O número total de tarefas é " + listatarefa.obterNumeroTotalTarefas());
        listatarefa.obterDescricoesTarefas();
    }
}

