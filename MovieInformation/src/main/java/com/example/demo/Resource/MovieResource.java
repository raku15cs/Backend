package com.example.demo.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Movies;

@RestController
@RequestMapping("/movie")
public class MovieResource  {
	
	@RequestMapping("/{movieid}")
	public Movies getMoviesInformation(@PathVariable String movieid)
	{
		return new Movies("tt11","Tranformer","test");
	}

}
