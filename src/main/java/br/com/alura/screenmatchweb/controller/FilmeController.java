package br.com.alura.screenmatchweb.controller;

import br.com.alura.screenmatchweb.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatchweb.domain.filme.Filme;
import br.com.alura.screenmatchweb.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes") /* mapeando a requisição */
public class FilmeController {

//    private List<Filme> filmes = new ArrayList<>(); era usada quando a lista ia pra memoria
    @Autowired // faz a instanciação e gerencia
    private FilmeRepository repository;

    @GetMapping ("/formulario")/* quando (acessar o endereço /filmes) requisição do tipo get vai acionar esse metodo*/
    public String carregaPaginaFormulario(){

        return "filmes/formulario";
        /* nome da pagina HTML que será acessada*/
    }

    @GetMapping public String carregaPaginaListagem(Model model){ /*Classe que acessa as variavereis para mandar para pagina de listagem*/
        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }
    @PostMapping /*envia dados do formulário*/
    public String cadastraFilme(DadosCadastroFilme dados){ /*Classe que recebe os dados do formulario, poderia tbm colocar eles um por um avulso mas geraria codigo dififil de manutenção*/
        var filme = new Filme(dados);
        repository.save(filme);

        return "redirect:/filmes";
        /* Redireciona para a pagina filmes que por sua vez vai puxar a o carregaPaginaListagem */
    }

}
