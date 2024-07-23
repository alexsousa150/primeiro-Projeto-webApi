package dio.alex.webApi.Repository;

import dio.alex.webApi.Model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void salvar(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }
    public void deletarPorID(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> buscarTodos(){
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Alex","password"));
        usuarios.add(new Usuario("Anne","masterpass"));
        return usuarios;
    }
    public Usuario procurarPorId(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("Alex","password");
    }
    public Usuario procurarPorNome(String username){
        System.out.println(String.format("FIND/username - Recebendo o Usuario: %s para localizar um usuário", username));
        return new Usuario("Alex","password");
    }
}

