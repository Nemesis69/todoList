package models;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: nemesis
 * Date: 16/05/13
 * Time: 15:20
 */

@Entity
public class Task extends Model{

    @Id
    public Long id;

    @Required()
    public String label;
}
