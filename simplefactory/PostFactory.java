package com.coffeepoweredcrew.simplefactory;

/**
 * This class acts as a simple factory for creation of 
 * different posts on web site.
 *
 */
public class PostFactory {

    public static Post createPost(String postType) {
        switch(postType) {
            case "product":
                return new ProductPost();
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost()
            default:
                return new IllegalArguementException("Not valid post type!");
        }
    }
}
