import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestarLivro(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo, LocalDate dataPrevista) {
        emprestimos.add(new Emprestimo(livro, pessoa, dataEmprestimo, dataPrevista));
    }

    public void devolverLivro(String titulo, Pessoa pessoa, LocalDate dataDevolucao, LocalDate dataPrevista) {
        for (Emprestimo emp : emprestimos) {
            if (emp.getLivro().getTitulo().equals(titulo) &&
                !emp.getDevolvido() &&
                emp.getPessoa().getNome().equalsIgnoreCase(pessoa.getNome())) {

                try {
                    emp.devolver(dataDevolucao);
                    System.out.println("Livro devolvido com sucesso!");
                } catch (MultaException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Livro não encontrado ou já devolvido.");
    }
}
