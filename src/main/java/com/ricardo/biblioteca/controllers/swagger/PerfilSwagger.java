package com.ricardo.biblioteca.controllers.swagger;

import com.ricardo.biblioteca.models.Perfil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Tag(name ="Endpoints de Perfis")
public interface PerfilSwagger {

    @Operation(summary = "Busca um perfil pelo id",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados do perfil retornado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "404", description = "Perfil não encontrado"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Perfil> getById(long id);

    @Operation(summary = "Busca todos os perfis",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Dados dos perfis retornados com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<List<Perfil>> getAll();

    @Operation(summary = "Insere um novo perfil",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Perfil inserido com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Perfil> create(Perfil perfil);

    @Operation(summary = "Atualiza um perfil",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Perfil atualizado com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Perfil> update(long id, Perfil perfil);

    @Operation(summary = "Exclui  um perfil",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Perfil excluído com sucesso"),
                    @ApiResponse(responseCode = "400", description = "Parâmetros inválidos"),
                    @ApiResponse(responseCode = "500", description = "Erro interno"),
            }
    )
    ResponseEntity<Perfil> delete(long id);
}
