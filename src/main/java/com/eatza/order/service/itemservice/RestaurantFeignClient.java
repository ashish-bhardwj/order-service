package com.eatza.order.service.itemservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eatza.order.dto.ItemFetchDto;

@FeignClient(name="restaurant-search-service")
public interface RestaurantFeignClient {
	
	 @GetMapping("/item/id/{id}")
	 public ItemFetchDto getItemById(@PathVariable("id") long id);

}
