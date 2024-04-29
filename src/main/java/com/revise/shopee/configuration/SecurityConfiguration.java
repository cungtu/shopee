package com.revise.shopee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration //Đánh dấu để Spring nhận diện và chạy vào
@EnableWebSecurity //Bật bảo mật toàn cục
public class SecurityConfiguration   {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("home", "/").permitAll()
                        .anyRequest().authenticated()
                )

                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )

                .logout((logout) -> logout.permitAll()
                );
        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService()
    {
        UserDetails userDetails = User.withDefaultPasswordEncoder().username("user")
                .password("123")
                .roles("USER")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }



}









