package az.edu.elibrary.dto.request;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class ReqDiscount {
    private String name;
    private BigDecimal discountPercentage;
    private Date startDate;
    private Date endDate;
}
