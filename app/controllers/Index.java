package controllers;

import play.Play;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Random;

/**
 * Created by Thomas on 6/17/2014.
 */
public class Index extends Controller {

    public static Result index() {

        return ok(views.html.index.render("Thomas McNally | Software Developer"));
    }
}
