import java.util.ArrayList;


public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){

    }

    public static void deletarUsuario(){

    }

    public static void atualizarUsuario() {

        System.out.println("Usuario atualizado \n");
    }
    public static void listarUsuarios(){

        System.out.println("Lista de usuários: \n");

    }

}
