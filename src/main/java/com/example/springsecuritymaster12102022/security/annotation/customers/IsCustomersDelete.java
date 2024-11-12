package com.example.springsecuritymaster12102022.security.annotation.customers;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.springsecuritymaster12102022.security.SecurityRoles.CUSTOMERS_DELETE;
import static com.example.springsecuritymaster12102022.security.SecurityRoles.ROLES_PREFIX;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Secured(ROLES_PREFIX + CUSTOMERS_DELETE)
public @interface IsCustomersDelete {
}
