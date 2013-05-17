package models;

import play.data.validation.Constraints.Required;

/**
 * Created with IntelliJ IDEA.
 * User: nemesis
 * Date: 16/05/13
 * Time: 15:20
 */
public class Task {

    public Long id;

    @Required()
    public String label;
}
