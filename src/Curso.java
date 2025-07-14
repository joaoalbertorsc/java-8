import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 50)
                .forEach(curso -> System.out.println(curso.getNome()));

        System.out.println();
        cursos.stream()
                .map(Curso::getAlunos)
                .filter(cAlunos -> cAlunos > 50)
                .forEach(System.out::println);
        System.out.println();

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));

    }
}
