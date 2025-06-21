import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descricao curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("POO em Java");
        curso1.setDescricao("Descricao curso de POO em Java");
        curso1.setCargaHoraria(9);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descricao mentoria de Java");
        mentoria1.setData(LocalDate.now());


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devYago = new Dev();
        devYago.setNome("Yago");
        devYago.InscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Yago: " + devYago.getConteudosInscritos());
        System.out.println('-');
        devYago.progredir();
        devYago.progredir();
        devYago.progredir();
        System.out.println("Conteúdos concluidos Yago: " + devYago.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Yago: " + devYago.getConteudosInscritos());
        System.out.println("XP: " + devYago.calcularTotalXp());
        
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        
        Dev devLuan = new Dev();
        devLuan.setNome("Luan");
        devLuan.InscreverBootCamp(bootCamp);
        System.out.println("Conteúdos Inscritos Luan: " + devLuan.getConteudosInscritos());
        System.out.println('-');
        devLuan.progredir();
        devLuan.progredir();
        devLuan.progredir();
        System.out.println("Conteúdos concluidos Luan: " + devLuan.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Luan: " + devLuan.getConteudosInscritos());
        System.out.println("XP: " + devLuan.calcularTotalXp());

    }
}
