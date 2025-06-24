import java.util.HashMap;

import Entities.Conta;
import Entities.Status;

public class Main {
    
    public static void main(String[] args) {
        
        HashMap<Integer, Conta> contas = new HashMap<>();
        Conta conta1 = new Conta("João", 123, "2008-04-28");
        Conta conta2 = new Conta("Eliel", 987, "2008-03-27");

        adicionarConta(contas, conta1);
        adicionarConta(contas, conta2);

        mostrarContas(contas);

        mudarStatus(contas, 0, "ONLINE");
        mudarStatus(contas, 1, "SUSPENSO");

        mostrarContas(contas);
    }
        
    public static void adicionarConta(HashMap<Integer, Conta> contas, Conta novaConta) {
        try {
            contas.put(contas.size(), novaConta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mudarStatus(HashMap<Integer, Conta> contas, int id, String status) {
        try {
            contas.get(id).setStatus(Status.valueOf(status));
            System.out.println("Seu status foi atualizado para: " + contas.get(id).getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mostrarContas(HashMap<Integer, Conta> contas) {
        try {
            System.out.println("-------------------------------------------");
            for (Conta conta : contas.values()) {
                System.out.println("Nome: " + conta.getNome());
                System.out.println("Senha: " + conta.getSenha());
                System.out.println("Idade: " + conta.getIdade());
                System.out.println("Status: " + conta.getStatus());
                System.out.println("-------------------------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
