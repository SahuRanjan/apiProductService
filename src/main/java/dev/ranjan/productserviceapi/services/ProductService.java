package dev.ranjan.productserviceapi.services;

import dev.ranjan.productserviceapi.dtos.GenericProductDto;
import dev.ranjan.productserviceapi.exceptions.NotFoundException;
import dev.ranjan.productserviceapi.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    GenericProductDto getProductById(Long id) throws NotFoundException;
    GenericProductDto createProduct(GenericProductDto product);
    List<GenericProductDto> getProducts();
    GenericProductDto deleteProductById(Long id);
    GenericProductDto updateProductbyId(GenericProductDto gpto,Long id);

}
