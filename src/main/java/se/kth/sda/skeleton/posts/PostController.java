package se.kth.sda.skeleton.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/*
    @TODO AutoWire PostService and create the methods needed to implement the API.
    Don't forget to add necessary annotations.
 */
@RestController
@Validated
@RequestMapping("/posts")
public class PostController {
   @Autowired
    private PostService postService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Post create(@Valid @RequestBody Post post) { return postService.save(post); }

    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAll();
    }

}
