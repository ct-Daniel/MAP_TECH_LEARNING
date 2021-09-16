import javax.xml.stream.events.EndElement;
import java.util.*;

public class Principal {

    public static void main(String[] args) throws Throwable {
        Collection<String> collection = new ArrayList<>();
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Endereco endereco = new Endereco();
        endereco.getBotao();

        System.out.println("\u1234");



        
    }
}

class Endereco implements Controle {
    String rua;
    String bairro;

    @Override
    public String getBotao() {
        return null;
    }
}

class Pessoa extends Endereco implements Controle {
    private String nome;
    private Integer idade;
    private Object Pessoa;

    public Object metodo(){
        return this;
    }




}

interface Controle {
    String getBotao();
}
