package com.abhijith.currency.exchange.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
public class AbCurrencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbCurrencyExchangeServiceApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
