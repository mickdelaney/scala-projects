package controllers;

import play.mvc.*;

public class Application extends Controller {

    public static void index() {
        render();
    }

  	public static void sayHello(String myName) {
        render(myName);
    }

}

