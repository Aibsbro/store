package com.aibar.ecommerce.store.service;

import com.aibar.ecommerce.store.domain.User;
import com.aibar.ecommerce.store.domain.UserBilling;
import com.aibar.ecommerce.store.domain.UserPayment;
import com.aibar.ecommerce.store.domain.UserShipping;
import com.aibar.ecommerce.store.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);

    User findByUsername(String username);

    User findByEmail(String email);

    User save(User user);

    User findById(Long id);

    void updateUserPaymentInfo(UserBilling userBilling, UserPayment userPayment, User user);

    void updateUserBilling(UserBilling userBilling, UserPayment userPayment, User user);

    void setUserDefaultPayment(Long userPaymentId, User user);

    void updateUserShipping(UserShipping userShipping, User user);

    void setUserDefaultShipping(Long userShippingId, User user);
}
