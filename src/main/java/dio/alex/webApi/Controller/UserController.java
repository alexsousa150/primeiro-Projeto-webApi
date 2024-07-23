package dio.alex.webApi.Controller;

import dio.alex.webApi.Model.Usuario;
import dio.alex.webApi.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuario")
public class UserController {
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> listar() {
        return repository.buscarTodos();
    }

    @PostMapping
    public void salvar(@RequestBody Usuario usuario) {
        repository.salvar(usuario);
    }

    @PutMapping
    public void atualizar(@RequestBody Usuario usuario) {
        repository.salvar(usuario);
    }

    @GetMapping("/{username}")
    public Usuario buscar(@PathVariable("username") String username) {
        return repository.procurarPorNome(username);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable("id") Integer id) {
        repository.deletarPorID(id);
    }
}