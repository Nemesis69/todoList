package controllers;

import models.Task;
import play.db.ebean.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: nemesis
 * Date: 16/05/13
 * Time: 15:27
 */
public class TaskController extends Model{

    public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

    public static List<Task> all(){
        return find.all();
    }

    public static void delete(Long id){
       find.ref(id).delete();
    }

    public static void createTask(Task t){
        t.save();
    }

}
