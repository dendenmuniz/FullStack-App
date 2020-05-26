package se.kth.sda.skeleton.posts;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


// @TODO add Hibernate annotations to define which table and columns should be used to save the Post Object.
import org.hibernate.validator.constraints.Length;

//private List<Comment> comments = new ArrayList<>();
@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Length(min = 30, max=300, message ="Please type at least 30 characters.")
    @Column(name = "postbody")
    private String body;

//    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)

    public Post() {
    }
    
   
    public Post(String body) {
        this.body = body;
    }

    @Column(name = "id")
    public Long getId() {
        return id;
    }
    
   
    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
