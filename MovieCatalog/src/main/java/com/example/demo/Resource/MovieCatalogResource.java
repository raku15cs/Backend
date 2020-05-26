package com.example.demo.Resource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.demo.Medels.CatalogItem;
import com.example.demo.Medels.Movies;
import com.example.demo.Medels.Rating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
	
	@RequestMapping("/{userid}")
	public List<CatalogItem>  getCatalog(@PathVariable String userid)
	{
	RestTemplate resttemplate=new RestTemplate();
	//Movies movies=resttemplate.getForObject("http://127.0.0.1:8082/movie/movieid", Movies.class);
		
		List<Rating> ratings=Arrays.asList(
				new Rating("rr15155",4),
				new Rating("rr15555",5)
				);
		return null;
		
	/*	return ratings.stream().map(rating -> {
			//Movies movies=resttemplate.getForObject("http://127.0.0.1:8082/movie/movieid", Movies.class);
			return new CatalogItem("Transformer ","Test",4));
		}).collect(Collectors.toList());  */
		
		return ratings.stream().map(rating -> {
			Movies movies=resttemplate.getForObject("http://127.0.0.1:8082/movie/movieid", Movies.class);
		//return new CatalogItem(name:"Transformer "des:,"Test",rating:4));
		}).collect(Collectors.toList()); 
		
	}

}
