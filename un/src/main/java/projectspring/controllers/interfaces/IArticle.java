package projectspring.controllers.interfaces;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import projectspring.dtos.ArticleDTO;

public interface IArticle {
    

    @PostMapping(value="localhost/articles/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Ajouter un article", notes = "Méthode API permettant d'ajouter un article", response = ArticleDTO.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Article ajouté avec succès"),
        @ApiResponse(code = 400, message = "Erreur de format d'entrée")
    })
    ResponseEntity<?> save(Object pArticleDTO);
}
