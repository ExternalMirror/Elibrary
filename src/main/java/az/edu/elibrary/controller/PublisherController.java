package az.edu.elibrary.controller;

import az.edu.elibrary.dto.request.ReqPublisher;
import az.edu.elibrary.dto.response.RespPublisher;
import az.edu.elibrary.dto.response.Response;
import az.edu.elibrary.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
public class PublisherController {

    private final PublisherService publisherService;

    @GetMapping("/list")
    public Response<List<RespPublisher>> getPublisherList(@RequestHeader String token) {
        return publisherService.getPublisherList(token);
    }

    @GetMapping("/{id}")
    public Response<RespPublisher> getById(@PathVariable Long id,@RequestHeader String token) {
        return publisherService.getById(id,token);
    }

    @PostMapping("/create")
    public Response create(@RequestBody ReqPublisher reqPublisher,@RequestHeader String token) {
        return publisherService.create(reqPublisher,token);
    }

    @PutMapping("/update/{id}")
    public Response<RespPublisher> update(@PathVariable Long id, @RequestBody ReqPublisher reqPublisher,@RequestHeader String token) {
        return publisherService.update(id, reqPublisher,token);
    }

    @PutMapping("/delete/{id}")
    public Response delete(@PathVariable Long id,@RequestHeader String token) {
        return publisherService.delete(id,token);
    }
}
