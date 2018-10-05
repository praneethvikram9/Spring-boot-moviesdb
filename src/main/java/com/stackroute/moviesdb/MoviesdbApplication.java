package com.stackroute.moviesdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MoviesdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesdbApplication.class, args);
	}
}


/* sample json input


{
	"imdbId":"tt5474036",
	"movieTitle":"Manmarziyaan",
	"postedUrl":"https://m.media-amazon.com/images/M/MV5BNTU3ZjEzMTYtYThjMC00ZjljLWJjYjEtZGU5M2U5ODcwNTY4XkEyXkFqcGdeQXVyNTE4ODU0NzA@._V1_QL50_SY1000_CR0,0,666,1000_AL_.jpg",
	"rating":4.2,
	"yearOfRelease":"2018",
	"comments":"romantic love story"
}
 */
