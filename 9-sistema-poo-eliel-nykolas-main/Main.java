import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();

        Pessoa pessoa1 = new Pessoa("Eliel");
        Pessoa pessoa2 = new Pessoa("Nykolas");
        Pessoa pessoa3 = new Pessoa("João");

        Livro livro1 = new Livro("A Culpa é das Estrelas", Categoria.ROMANCE);
        Livro livro2 = new Livro("Clean Code", Categoria.TECNICO);
        Livro livro3 = new Livro("Lobo Mau", Categoria.INFANTIL);

        LocalDate dataEmprestimo = LocalDate.now();
        LocalDate dataPrevistaDevolucao = dataEmprestimo.plusDays(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("\n========== EMPRÉSTIMOS REALIZADOS ==========");
        biblio.emprestarLivro(livro1, pessoa1, dataEmprestimo, dataPrevistaDevolucao);
        System.out.printf("%s pegou '%s' (%s) emprestado em %s\n",
                pessoa1.getNome(), livro1.getTitulo(), livro1.getCategoria(), dataEmprestimo.format(formatter));
        System.out.printf("Data prevista para devolução: %s\n\n", dataPrevistaDevolucao.format(formatter));

        biblio.emprestarLivro(livro2, pessoa2, dataEmprestimo, dataPrevistaDevolucao);
        System.out.printf("%s pegou '%s' (%s) emprestado em %s\n",
                pessoa2.getNome(), livro2.getTitulo(), livro2.getCategoria(), dataEmprestimo.format(formatter));
        System.out.printf("Data prevista para devolução: %s\n\n", dataPrevistaDevolucao.format(formatter));

        biblio.emprestarLivro(livro3, pessoa3, dataEmprestimo, dataPrevistaDevolucao);
        System.out.printf("%s pegou '%s' (%s) emprestado em %s\n",
                pessoa3.getNome(), livro3.getTitulo(), livro3.getCategoria(), dataEmprestimo.format(formatter));
        System.out.printf("Data prevista para devolução: %s\n\n", dataPrevistaDevolucao.format(formatter));

        System.out.println("\n========== PROCESSANDO DEVOLUÇÕES ==========");

        LocalDate dataDevolucaoEliel = dataEmprestimo.plusDays(15);
        long diasAntesEliel = ChronoUnit.DAYS.between(dataDevolucaoEliel, dataPrevistaDevolucao);
        System.out.printf("%s devolveu '%s' em %s\n",
                pessoa1.getNome(), livro1.getTitulo(), dataDevolucaoEliel.format(formatter));
        System.out.printf("Devolvido %d dias antes do prazo.\n",
                diasAntesEliel, dataPrevistaDevolucao.format(formatter));
        biblio.devolverLivro(livro1.getTitulo(), pessoa1, dataDevolucaoEliel, dataPrevistaDevolucao);
        System.out.println();

        LocalDate dataDevolucaoNyko = dataEmprestimo.plusDays(39);
        System.out.printf("%s devolveu '%s' em %s\n",
                pessoa2.getNome(), livro2.getTitulo(), dataDevolucaoNyko.format(formatter));
        biblio.devolverLivro(livro2.getTitulo(), pessoa2, dataDevolucaoNyko, dataPrevistaDevolucao);
        System.out.println();

        LocalDate dataDevolucaoJoão = dataEmprestimo.plusDays(43);
        System.out.printf("%s devolveu '%s' em %s\n",
                pessoa3.getNome(), livro3.getTitulo(), dataDevolucaoJoão.format(formatter));
        biblio.devolverLivro(livro3.getTitulo(), pessoa3, dataDevolucaoJoão, dataPrevistaDevolucao);
    }
}