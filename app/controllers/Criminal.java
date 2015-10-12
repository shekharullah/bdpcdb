package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.admin.criminal.*;

public class Criminal  extends Controller {
	 public static Result blank() {
	    	return ok(addCriminal.render());
	    }
}
