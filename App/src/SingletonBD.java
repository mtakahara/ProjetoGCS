import java.util.ArrayList;

public class SingletonBD {

    private static ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

    private SingletonBD() { }

    public static void adicionarUsuario(){
        System.out.print("Usuário criado com sucesso\n");
        System.out.print("Selecione outra opção!\n");
    }

    public static void deletarUsuario(){ }

    System.out.println("Usuário deletado com sucesso\n");

    public static void atualizarUsuario(){ }

    public static void listarUsuarios(){ }

}
