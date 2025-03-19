package dev.alexandre_olivera.CadastroDeMotos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MotoController {

        @GetMapping("/boasVindas")
        public String boasVindas() {
            return "Essa é minha mensagem";
        }


}
