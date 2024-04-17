package com.revise.shopee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;



@Configuration //Chạy mọi @Bean
@EnableWebSecurity //Bật bảo mật toàn cục
public class SecurityConfiguration  {

//        @Bean
//        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//            http
//                    .csrf(Customizer.withDefaults())
//                    .authorizeHttpRequests(authorize -> authorize
//                            .anyRequest().authenticated()
//                    )
//                    .httpBasic(Customizer.withDefaults())
//                    .formLogin(Customizer.withDefaults());
//            return http.build();
//        }

//    static {
//        userDetailsManager();
//    }
    @Bean
    public static InMemoryUserDetailsManager userDetailsManager() {

        UserDetails john = User.builder()
                .username("john")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails mary = User.builder()
                .username("mary")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(john, mary, susan);
    }




}









