package br.com.alura.screenmatchweb.controller;

import br.com.alura.screenmatchweb.model.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes") /* mapeando a requisição */
public class FilmeController {
    @GetMapping /* quando (acessar o endereço /filmes) requisição do tipo get vai acionar esse metodo*/
    public String carregaPaginaFormulario(){
        return "filmes/formulario"; /* nome da pagina HTML que será acessada*/
    }
    @PostMapping /*envia dados do formulário*/
    public String cadastraFilme(DadosCadastroFilme dados){ /*Classe que recebe os dados do formulario, poderia tbm colocar eles um por um avulso mas geraria codigo dififil de manutenção*/
        System.out.println(dados);
        return "filmes/formulario";
    }

}
