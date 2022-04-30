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

        System.out.println("Usuario atualizado \n");
    }
    public static void listarUsuarios(){

        System.out.println("Lista de usuários: \n");

        if (listaUsuario.size() != 0){
        for (int i = 0; i < listaUsuario.size(); i++) {
            System.out.print("Usuario: " + listaUsuario.get(i).getUsuario() + " |  ");
            System.out.print("Senha: " + listaUsuario.get(i).getSenha() + " |  ");
            System.out.print("Nome: " + listaUsuario.get(i).getNome() + " |  ");
            System.out.print("Ano de Nascimento: " + listaUsuario.get(i).getAnoNascimento() + "\n\n");
        }
        } else{
            System.out.println("Lista Vazia \n");
        }
    }

}
