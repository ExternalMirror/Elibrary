package az.project.springbootproject.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqTransaction {
    private Long customerId;
    private Long basketId;
}
