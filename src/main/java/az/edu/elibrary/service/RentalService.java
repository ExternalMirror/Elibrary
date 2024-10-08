package az.edu.elibrary.service;

import az.edu.elibrary.dto.response.RespRental;
import az.edu.elibrary.dto.response.Response;

import java.util.List;

public interface RentalService {

    Response<List<RespRental>> listRentals(String token);

    Response<RespRental> getRentalById(Long id,String token);
    Response<RespRental> returnBook(Long rentalId,String token);
    Response<List<RespRental>> getRentalsByCustomerId(Long customerId, String token);

}
