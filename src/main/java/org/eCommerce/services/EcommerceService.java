package org.eCommerce.services;

import org.eCommerce.data.model.User;
import org.eCommerce.dtos.request.RegisterRequest;

public interface EcommerceService {
    User register(RegisterRequest registerRequest);

}
