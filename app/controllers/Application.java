package controllers;

import models.Task;
import play.data.Form;
import play.mvc.*;

public class Application extends Controller {

    static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return ok(views.html.index.render(TaskController.all(), taskForm));

    }

    public static Result tasks(){
        return TODO;
    }

    public static Result newTask(){
        Form<Task> filledForm = taskForm.bindFromRequest();
        if(filledForm.hasErrors()){
            return badRequest(views.html.index.render(TaskController.all(), filledForm));
        }else{
            return redirect(routes.Application.tasks());
        }
    }

    public static Result deleteTask(Long id){
        return TODO;
    }
}