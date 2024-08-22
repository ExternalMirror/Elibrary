package az.project.springbootproject.dto.response;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class RespAuthor {
    private long id;
    private String name;
    private String bio;
}
