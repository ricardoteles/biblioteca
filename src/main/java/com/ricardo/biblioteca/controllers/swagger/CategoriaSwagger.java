package com.ricardo.biblioteca.controllers.swagger;

import com.ricardo.biblioteca.models.Categoria;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name ="Endpoints de Categorias")
public interface CategoriaSwagger {

    @Operation(summary = "Busca uma categoria pelo id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados da categoria retornado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "404", description = "Categoria não encontrada"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Categoria> getById(long id);

    @Operation(summary = "Busca todas as categorias",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados das categorias retornados com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<List<Categoria>> getAll();

    @Operation(summary = "Insere uma nova categoria",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Categoria inserida com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Categoria> create(Categoria categoria);

    @Operation(summary = "Atualiza uma categoria",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Categoria atualizada com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Categoria> update(long id, Categoria categoria);

    @Operation(summary = "Exclui  uma categoria",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Categoria excluída com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Categoria> delete(long id);
}
