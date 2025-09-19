import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.adicionarCurso("Curso Java", "Curso para aprender Java", 10);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.adicionarMentoria("Mentoria Js", "Mentoria Javascript");

        System.out.println(mentoria1);
    }
}
