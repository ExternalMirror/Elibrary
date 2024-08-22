package az.project.springbootproject.controller;

import az.project.springbootproject.dto.request.ReqAuthor;
import az.project.springbootproject.dto.response.RespAuthor;
import az.project.springbootproject.dto.response.Response;
import az.project.springbootproject.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/list")
    public Response<List<RespAuthor>> getAuthorList(@RequestHeader String token) {
        return authorService.getAuthorList(token);
    }

    @GetMapping("/{id}")
    public Response<RespAuthor> getById(@PathVariable Long id,@RequestHeader String token) {
        return authorService.getById(id,token);
    }

    @PostMapping("/create")
    public Response create(@RequestBody ReqAuthor reqAuthor,@RequestHeader String token) {
        return authorService.create(reqAuthor,token);
    }

    @PutMapping("/update/{id}")
    public Response<RespAuthor> update(@PathVariable Long id, @RequestBody ReqAuthor reqAuthor,@RequestHeader String token) {
        return authorService.update(id,reqAuthor,token);
    }

    @PutMapping("/delete/{id}")
    public Response delete(@PathVariable Long id,@RequestHeader String token) {
        return authorService.delete(id,token);
    }
}
