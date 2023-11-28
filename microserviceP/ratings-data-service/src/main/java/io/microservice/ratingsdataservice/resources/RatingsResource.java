package io.microservice.ratingsdataservice.resources;


import io.microservice.ratingsdataservice.models.Rating;
import io.microservice.ratingsdataservice.models.UserRating;
import io.microservice.ratingsdataservice.models.Rating;
import io.microservice.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/ratingsdata")
    public class RatingsResource {

        @RequestMapping("/movies/{movieId}")
        public Rating getMovieRating(@PathVariable("movieId") String movieId) {
            return new Rating(movieId, 4);
        }

        @RequestMapping("/user/{userId}")
        public UserRating getUserRatings(@PathVariable("userId") String userId) {
            UserRating userRating = new UserRating();
            userRating.initData(userId);
            return userRating;

        }

    }

