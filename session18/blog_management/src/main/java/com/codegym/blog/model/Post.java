package com.codegym.blog.model;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String postName;
    private String postDescription;
    private String postDate;
    private String postBy;

    public Post(String postName, String postDescription, String postDate, String postBy) {
        this.postName = postName;
        this.postDescription = postDescription;
        this.postDate = postDate;
        this.postBy = postBy;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostBy() {
        return postBy;
    }

    public void setPostBy(String postBy) {
        this.postBy = postBy;
    }

    /*@Override
    public String toString(){
        return String.format("Post[id=%d, postName='%s', postDescription='%s', postDate='%s', postBy='%s']", id, postName, postDescription, postDate, postBy);
    }*/
}
