//package com.mycompany.spring.cabinet.springtest.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests(
//                        auth
//                        -> auth
//                                .requestMatchers("/**").permitAll()
//                                .anyRequest().authenticated()
//                )
//                .formLogin(login
//                        -> login
//                        .permitAll()
//                )
//                .logout(logout
//                        -> logout
//                        .permitAll()
//                )
//                .csrf(csrf -> csrf.disable()); // Dezactivează protecția CSRF pentru exemplu (nu este recomandat pentru producție)
//
//        return http.build();
//    }
//}
