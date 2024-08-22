package az.project.springbootproject.controller;

import az.project.springbootproject.dto.request.ReqGenre;
import az.project.springbootproject.dto.response.RespGenre;
import az.project.springbootproject.dto.response.Response;
import az.project.springbootproject.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genre")
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @GetMapping("/list")
    public Response<List<RespGenre>> getGenreList(@RequestHeader String token) {
        return genreService.getGenreList(token);
    }

    @GetMapping("/{id}")
    public Response<RespGenre> getById(@PathVariable Long id,@RequestHeader String token) {
        return genreService.getById(id,token);
    }

    @PostMapping("/create")
    public Response create(@RequestBody ReqGenre reqGenre,@RequestHeader String token) {
        return genreService.create(reqGenre,token);
    }

    @PutMapping("/update/{id}")
    public Response<RespGenre> update(@PathVariable Long id, @RequestBody ReqGenre reqGenre,@RequestHeader String token) {
        return genreService.update(id, reqGenre,token);
    }

    @PutMapping("/delete/{id}")
    public Response delete(@PathVariable Long id,@RequestHeader String token) {
        return genreService.delete(id,token);
    }
}
