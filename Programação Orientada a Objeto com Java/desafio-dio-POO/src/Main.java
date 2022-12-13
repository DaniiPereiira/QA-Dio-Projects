
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Maria");
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("\n " + dev1.getNome() + " \n");
        System.out.println("Conteúdos inscritos "  + dev1.getConteudosConcluidos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-------");
        System.out.println("Conteúdos inscritos "  + dev1.getConteudosConcluidos());
        System.out.println("Conteúdos concluidos "  + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("\n--------------------------\n");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println(dev2.getNome() + " \n");
        System.out.println("Conteúdos inscritos "+ dev2.getNome() + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("---------");
        System.out.println("Conteúdos inscritos "+ dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos " + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());


    }
}
