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



    public static Result birthday() {

        Random r = new Random();

        int quoteRand = r.nextInt(5) + 1;
        int pictureRand = r.nextInt(5) + 1;

        String quote = Play.application().configuration().getString(quoteRand + "");



        return ok(views.html.adam.render(quote, pictureRand));
    }
}
