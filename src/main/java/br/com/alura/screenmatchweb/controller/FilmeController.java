package br.com.alura.screenmatchweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes/") /* mapeando a requisição */
public class FilmeController {
    @GetMapping /* quando (acessar o endereço /filmes) requisição do tipo get vai acionar esse metodo*/
    public String carregaPaginaFormulario(){
        return "filmes/formulario"; /* nome da pagina HTML que será acessada*/
    }

}
