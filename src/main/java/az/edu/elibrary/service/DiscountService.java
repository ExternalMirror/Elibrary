package az.edu.elibrary.service;

import az.edu.elibrary.dto.request.ReqDiscount;
import az.edu.elibrary.dto.response.RespDiscount;
import az.edu.elibrary.dto.response.Response;

import java.util.List;

public interface DiscountService {
    Response<List<RespDiscount>> getDiscountList(String token);
    Response<RespDiscount> getById(Long discountId,String token);
    Response create(ReqDiscount reqDiscount,String token);
    Response<RespDiscount> update(Long discountId, ReqDiscount reqDiscount,String token);
    Response delete(Long discountId,String token);



}
