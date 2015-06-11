import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.libs.F.*;
import views.html.pageNotFound;

import static play.mvc.Results.*;
/**
 * Created by Thomas on 6/17/2014.
 */
public class Global extends GlobalSettings {

    public Promise<SimpleResult> onError(RequestHeader request, Throwable t) {
        return Promise.<SimpleResult>pure(internalServerError(
                pageNotFound.render("" )
        ));
    }

    public Promise<SimpleResult> onHandlerNotFound(RequestHeader request) {
        return Promise.<SimpleResult>pure(notFound(
                views.html.pageNotFound.render(request.uri())
        ));
    }

}