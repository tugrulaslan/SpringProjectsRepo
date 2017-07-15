package com.tugrulaslan.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Tugrul on 6/14/2015.
 */
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @Column(name = "postid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;

    @Column(name = "postTitle")
    private String postTitle;

    @Column(name = "postContext")
    private String postContext;

    @Column(name = "visitCount")
    private long visitCount;

    @Column(name = "publishable")
    private boolean publishable;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "post_category", joinColumns = {
            @JoinColumn(name = "postid")},
            inverseJoinColumns = {@JoinColumn(name = "categoryid")})
    private Set<Category> categories = new HashSet<Category>();

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Post() {
    }

    public Post(String postTitle, String postContext, boolean publishable, Set<Category> categories, User user) {
        this.postTitle = postTitle;
        this.postContext = postContext;
        this.publishable = publishable;
        this.categories = categories;
        this.user = user;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostContext() {
        return postContext;
    }

    public void setPostContext(String postContext) {
        this.postContext = postContext;
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount) {
        this.visitCount = visitCount;
    }

    public boolean isPublishable() {
        return publishable;
    }

    public void setPublishable(boolean publishable) {
        this.publishable = publishable;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
