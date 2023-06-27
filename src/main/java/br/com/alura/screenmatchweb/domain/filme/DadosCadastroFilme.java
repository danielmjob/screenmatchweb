package br.com.alura.screenmatchweb.domain.filme;

/*usado tipo record pois não havera alterações diretas e nesse tipo ja tem get e set auto implementado*/
public record DadosCadastroFilme(String nome, Integer duracao, Integer ano, String genero) {
}
