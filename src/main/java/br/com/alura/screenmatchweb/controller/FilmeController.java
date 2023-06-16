package br.com.alura.screenmatchweb.controller;

import br.com.alura.screenmatchweb.model.filme.DadosCadastroFilme;
import br.com.alura.screenmatchweb.model.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes") /* mapeando a requisição */
public class FilmeController {

    private List<Filme> filmes = new ArrayList<>();

    @GetMapping ("/formulario")/* quando (acessar o endereço /filmes) requisição do tipo get vai acionar esse metodo*/
    public String carregaPaginaFormulario(){

        return "filmes/formulario";
        /* nome da pagina HTML que será acessada*/
    }

    @GetMapping public String carregaPaginaListagem(){
        return "filmes/listagem";
    }
    @PostMapping /*envia dados do formulário*/
    public String cadastraFilme(DadosCadastroFilme dados){ /*Classe que recebe os dados do formulario, poderia tbm colocar eles um por um avulso mas geraria codigo dififil de manutenção*/
        var filme = new Filme(dados);
        filmes.add(filme);

        System.out.println(filmes); /*verifica se foi salvo na lista*/
        return "filmes/formulario";
    }

}
