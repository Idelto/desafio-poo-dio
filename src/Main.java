import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setTitulo("mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.setNome("bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIdelto = new Dev();
        devIdelto.setNome("Idelto");
        devIdelto.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devIdelto.getConteudosInscritos());
        devIdelto.progredir();
        System.out.println("_");
        System.out.println("Conteudos inscritos: "+devIdelto.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+devIdelto.getConteudosConcluidos());
        System.out.println("XP : "+devIdelto.calcularTotalXp());

        System.out.println("--------------------------");

        Dev devCamila = new Dev();
        devIdelto.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("_");
        System.out.println("Conteudos inscritos: "+devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos: "+devCamila.getConteudosConcluidos());
        System.out.println("XP : "+devCamila.calcularTotalXp());


    }
}