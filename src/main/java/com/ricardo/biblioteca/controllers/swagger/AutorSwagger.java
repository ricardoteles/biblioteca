package com.ricardo.biblioteca.controllers.swagger;

import com.ricardo.biblioteca.models.Autor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name ="Endpoints de Autores")
public interface AutorSwagger {

    @Operation(summary = "Busca um autor pelo id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados do autor retornado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "404", description = "Autor não encontrado"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Autor> getById(long id);

    @Operation(summary = "Busca todos os autores",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados dos autores retornados com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<List<Autor>> getAll();

    @Operation(summary = "Insere um novo autor",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Autor inserido com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Autor> create(Autor autor);

    @Operation(summary = "Atualiza um autor",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Autor atualizado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Autor> update(long id, Autor autor);

    @Operation(summary = "Exclui  um autor",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Autor excluído com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Autor> delete(long id);
}
