package com.aman;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Set;

@Component
public class AppFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        System.out.println("filter methos called");



        ServerHttpRequest request = exchange.getRequest();

        HttpHeaders headers = request.getHeaders();

        Flux<DataBuffer> body = request.getBody();

       // boolean isValid = false;
//        if(isValid){
//
//            return  null;
//        }
//        else {
//            return chain.filter(exchange);
//
//        }

        System.out.println(headers);

        Set<String> keySet = headers.keySet();
        keySet.forEach(key->{
            List<String> values = headers.get(key);
            System.out.println(key);
            System.out.println(values);
            System.out.println("=================");});

        ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.BAD_REQUEST);

                    response.writeAndFlushWith(null);


        return chain.filter(exchange);


    }
}
