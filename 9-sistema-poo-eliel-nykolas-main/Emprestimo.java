import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevistaDevolucao;
    private boolean devolvido;

    public Emprestimo(Livro livro, Pessoa pessoa, LocalDate dataEmprestimo, LocalDate dataPrevistaDevolucao) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
        this.devolvido = false;
    }

    public void devolver(LocalDate dataDevolucao) throws MultaException {
        long diasAtraso = ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataDevolucao);
    
        if (diasAtraso > 7) {
            throw new MultaException("Devolução atrasada em " + (diasAtraso - 7) + " dias. Multa aplicada!");
        }
        this.devolvido = true;
    }

    public Livro getLivro() {
        return livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public boolean getDevolvido() {
        return devolvido;
    }
}
