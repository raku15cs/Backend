package com.example.demo.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Rating;

@RestController
@RequestMapping("/Rating")
public class RatingResource {

	@RequestMapping("/{userid}")
	public Rating getRatingdata(@PathVariable String userid) {

		return new Rating("tt22",4);
	}
}
