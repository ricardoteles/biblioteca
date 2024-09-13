package com.ricardo.biblioteca.controllers.swagger;

import com.ricardo.biblioteca.models.Livro;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name ="Endpoints de Livros")
public interface LivroSwagger {

    @Operation(summary = "Busca um livro pelo id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados do livro retornado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "404", description = "Livro não encontrado"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Livro> getById(long id);

    @Operation(summary = "Busca todos os livros",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados dos livros retornados com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<List<Livro>> getAll();

    @Operation(summary = "Insere um novo livro",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Livro inserido com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Livro> create(Livro livro);

    @Operation(summary = "Atualiza um livro",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Livro atualizado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Livro> update(long id, Livro livro);

    @Operation(summary = "Exclui  um livro",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Livro excluído com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Livro> delete(long id);
}
