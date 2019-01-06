package com.aibar.ecommerce.store.service.impl;


import com.aibar.ecommerce.store.domain.UserShipping;
import com.aibar.ecommerce.store.repository.UserShippingRepository;
import com.aibar.ecommerce.store.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    public UserShipping findById(Long id) {
        return userShippingRepository.findOne(id);
    }

    public void removeById(Long id) {
        userShippingRepository.delete(id);
    }
}

