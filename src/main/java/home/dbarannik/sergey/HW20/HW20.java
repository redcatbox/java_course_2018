package home.dbarannik.sergey.HW20;

import java.util.List;

public class HW20 {
    public static void main(String[] args) {
        ApiService service = ApiService.getInstance();

        List<Post> posts = service.getPosts();
        System.out.println("Posts");
        System.out.println(posts.toString());

        List<Comment> comments = service.getComments();
        System.out.println("Comments");
        System.out.println(comments.toString());

        List<Album> albums = service.getAlbums();
        System.out.println("Albums");
        System.out.println(albums.toString());

        List<Photo> photos = service.getPhotos();
        System.out.println("Photos");
        System.out.println(photos.toString());

        List<User> users = service.getUsers();
        System.out.println("Users");
        System.out.println(users.toString());

        List<Todo> todos = service.getTodos();
        System.out.println("Todos");
        System.out.println(todos.toString());
    }
}

//    Написать класс MyApiService с использованием паттерна синглтон для доступа к API:
//
//        (предварительно создать все необходимые модели List, Post, User...)
//
//        Пример:
//
//        ApiService service = ApiService.getInstance();
//
//        List<Post> posts = service.getPosts();
//
//        Для следующих запросов:
//
//        Posts https://jsonplaceholder.typicode.com/posts
//
//        Comments https://jsonplaceholder.typicode.com/comments
//
//        Albums https://jsonplaceholder.typicode.com/albums
//
//        Photos https://jsonplaceholder.typicode.com/photos
//
//        Users https://jsonplaceholder.typicode.com/users
//
//        Todos https://jsonplaceholder.typicode.com/todos