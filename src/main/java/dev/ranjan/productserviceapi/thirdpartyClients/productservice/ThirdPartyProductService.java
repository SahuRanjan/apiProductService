package dev.ranjan.productserviceapi.thirdpartyClients.productservice;

import dev.ranjan.productserviceapi.thirdpartyClients.productservice.fakestore.FakeStoreProductDto;
import dev.ranjan.productserviceapi.dtos.GenericProductDto;
import dev.ranjan.productserviceapi.exceptions.NotFoundException;

import java.util.List;

public interface ThirdPartyProductService {
    FakeStoreProductDto getProductById(Long id) throws NotFoundException;
    FakeStoreProductDto createProduct(GenericProductDto product);
    List<FakeStoreProductDto> getProducts();
    FakeStoreProductDto deleteProductById(Long id);
    FakeStoreProductDto updateProductbyId(GenericProductDto gpto,Long id);

}