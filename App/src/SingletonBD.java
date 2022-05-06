import java.util.ArrayList;


public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        System.out.print("Usuário criado com sucesso\n");
    }

    public static void deletarUsuario(){
        System.out.print("Usuário deletado com sucesso\n");
    }

    public static void atualizarUsuario() {
	System.out.println("Usuário atualizado");

    }
    public static void listarUsuarios(){
        System.out.println("Lista de usuários: \n");

    }

    public static void deletarBD(){
        System.out.println("BD será deletado.\n");

    }


}
