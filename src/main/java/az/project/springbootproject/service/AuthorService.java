package az.project.springbootproject.service;

import az.project.springbootproject.dto.request.ReqAuthor;
import az.project.springbootproject.dto.response.RespAuthor;
import az.project.springbootproject.dto.response.Response;

import java.util.List;

public interface AuthorService {
    Response<List<RespAuthor>> getAuthorList(String token);
    Response<RespAuthor> getById(Long authorId,String token);
    Response create(ReqAuthor reqAuthor,String token);
    Response<RespAuthor> update(Long authorId,ReqAuthor reqAuthor,String token);
    Response delete(Long authorId,String token);
}
